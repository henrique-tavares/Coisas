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
cropped_img = filters.gaussian(cropped_img, multichannel=True)
cropped_img = filters.median(cropped_img)

grayscale_img = color.rgb2gray(cropped_img)

seed = np.copy(grayscale_img)
seed[1:-1, 1:-1] = grayscale_img.max()
mask = grayscale_img

eroded = morphology.reconstruction(seed, mask, method="erosion")

no_bg_img = grayscale_img - eroded

# fig, axes = filters.try_all_threshold(no_bg_img)

threshold = filters.threshold_yen(no_bg_img)

binary_img = no_bg_img < threshold
binary_img = filters.gaussian(binary_img)
binary_img = filters.median(binary_img)

masked_grayscale_img = cv2.bitwise_and(util.img_as_uint(grayscale_img), util.img_as_uint(binary_img * 255))
masked_grayscale_img = exposure.adjust_gamma(masked_grayscale_img)
masked_grayscale_img = exposure.rescale_intensity(masked_grayscale_img)
masked_grayscale_img = exposure.equalize_adapthist(masked_grayscale_img)

# result = np.copy(grayscale_img)
# result[mask == 0] = 0.0

# no_bg_img = exposure.rescale_intensity(no_bg_img)
# no_bg_img = filters.median(no_bg_img)
# no_bg_img = exposure.equalize_adapthist(no_bg_img)

# masked_img = cv2.bitwise_and(cropped_img, cropped_img, mask=util.img_as_ubyte(binary_img))
# masked_img = exposure.adjust_gamma(masked_img)
# masked_img = exposure.rescale_intensity(masked_img)
# masked_img = exposure.equalize_adapthist(masked_img)
# masked_img = color.rgb2hsv(masked_img)

fig, axes = plt.subplots(2, 3)
ax = axes.flatten()

ax[0].imshow(cropped_img)
ax[0].set_axis_off()

ax[1].imshow(grayscale_img, cmap="gray")
ax[1].set_axis_off()

ax[2].imshow(no_bg_img, cmap="gray")
ax[2].set_axis_off()

ax[3].imshow(binary_img, cmap="gray")
ax[3].set_axis_off()

ax[4].imshow(masked_grayscale_img, cmap="gray")
ax[4].set_axis_off()

# ax[5].imshow(result, cmap="gray")
# ax[5].set_axis_off()

plt.show()
