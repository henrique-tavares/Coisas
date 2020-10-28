from os import path
from skimage import io, transform, color, exposure, util, filters, morphology, segmentation
import numpy as np
from matplotlib import pyplot as plt
import cv2

img = io.imread(path.join(path.curdir, "pequis", "IMG_20201016_121439759.jpg"))

new_scale = 512 / img.shape[0]

rescaled_img = transform.rescale(img, new_scale, multichannel=True, anti_aliasing=True)

cropped_img = rescaled_img[:, int((rescaled_img.shape[1] - 512) / 2) : int(512 + (rescaled_img.shape[1] - 512) / 2)]

cropped_img = util.img_as_float(cropped_img)
cropped_img = exposure.adjust_gamma(cropped_img)
cropped_img = exposure.rescale_intensity(cropped_img)
cropped_img = filters.median(cropped_img)

seed = np.copy(cropped_img)
seed[1:-1, 1:-1] = cropped_img.max()
mask = cropped_img

eroded_color = morphology.reconstruction(seed, mask, method="erosion")

no_bg_color_img = eroded_color - cropped_img
inv_no_bg_color_img = util.invert(no_bg_color_img)

no_bg_color_img = exposure.rescale_intensity(no_bg_color_img)
no_bg_color_img = exposure.equalize_adapthist(no_bg_color_img)

inv_no_bg_color_img = exposure.rescale_intensity(inv_no_bg_color_img)
inv_no_bg_color_img = exposure.equalize_adapthist(inv_no_bg_color_img)

grayscale_img = color.rgb2gray(cropped_img)

seed = np.copy(grayscale_img)
seed[1:-1, 1:-1] = grayscale_img.max()
mask = grayscale_img

eroded = morphology.reconstruction(seed, mask, method="erosion")

no_bg_img = grayscale_img - eroded
inv_no_bg_img = util.invert(no_bg_img)

no_bg_img = exposure.rescale_intensity(no_bg_img)

inv_no_bg_img = exposure.rescale_intensity(inv_no_bg_img)
inv_no_bg_img = exposure.equalize_adapthist(inv_no_bg_img)


threshold = filters.threshold_yen(no_bg_img)

binary_img = no_bg_img < threshold
binary_img = filters.median(binary_img, morphology.disk(10))

mask = util.img_as_ubyte(binary_img)

mask[mask > 0] = cv2.GC_PR_FGD
mask[mask == 0] = cv2.GC_BGD

bg_model = np.zeros((1, 65), np.float)
fg_model = np.zeros((1, 65), np.float)

cv2.grabCut(util.img_as_ubyte(cropped_img), mask, None, bg_model, fg_model, 10, cv2.GC_INIT_WITH_MASK)

mask2 = np.where((mask == cv2.GC_BGD) | (mask == cv2.GC_PR_BGD), 0, 1).astype("uint8")

new_img = cropped_img * mask2[:, :, np.newaxis]
new_img = exposure.rescale_intensity(new_img)
new_img = exposure.equalize_adapthist(new_img)

new_gray_img = color.rgb2gray(new_img)

fig, axes = plt.subplots(2, 4)
ax = axes.flatten()

ax[0].imshow(cropped_img)
ax[0].set_axis_off()

ax[1].imshow(grayscale_img, cmap="gray")
ax[1].set_axis_off()

ax[2].imshow(no_bg_img, cmap="gray")
ax[2].set_axis_off()

ax[3].imshow(inv_no_bg_img, cmap="gray")
ax[3].set_axis_off()

ax[4].imshow(no_bg_color_img)
ax[4].set_axis_off()

ax[5].imshow(inv_no_bg_color_img)
ax[5].set_axis_off()

ax[6].imshow(new_img)
ax[6].set_axis_off()

ax[7].imshow(new_gray_img, cmap="gray")
ax[7].set_axis_off()

plt.show()
