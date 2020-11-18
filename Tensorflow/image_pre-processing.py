from os import path
from skimage import io, transform, color, exposure, util, filters, morphology, segmentation, draw, measure
import numpy as np
from matplotlib import pyplot as plt
import cv2
from math import ceil

img = io.imread(path.join(path.curdir, "pequis", "2-04.jpg"))
IMG_SIZE = 512  # 512x512

new_scale = IMG_SIZE / img.shape[0]

rescaled_img = transform.rescale(img, new_scale, multichannel=True, anti_aliasing=True)

cropped_img = rescaled_img[
    :, int((rescaled_img.shape[1] - IMG_SIZE) / 2) : int(IMG_SIZE + (rescaled_img.shape[1] - IMG_SIZE) / 2)
]

cropped_img = util.img_as_float(cropped_img)
cropped_img = exposure.adjust_gamma(cropped_img)
cropped_img = exposure.rescale_intensity(cropped_img)
cropped_img = filters.median(cropped_img)


grayscale_img = color.rgb2gray(cropped_img)

seed = np.copy(grayscale_img)
seed[1:-1, 1:-1] = grayscale_img.max()
mask = grayscale_img

eroded = morphology.reconstruction(seed, mask, method="erosion")

no_bg_img = grayscale_img - eroded

inv_no_bg_img = util.invert(no_bg_img)
inv_no_bg_img = exposure.rescale_intensity(inv_no_bg_img)
inv_no_bg_img = exposure.equalize_adapthist(inv_no_bg_img)


s = np.linspace(0, 2 * np.pi, 500)
r = (IMG_SIZE / 2) + (IMG_SIZE / 2 - 5) * np.sin(s)
c = (IMG_SIZE / 2) + (IMG_SIZE / 2 - 5) * np.cos(s)
init = np.array([r, c]).T

contour = segmentation.active_contour(inv_no_bg_img, init, alpha=0.1, beta=10, coordinates="rc", max_iterations=10000)


mask = draw.polygon2mask((IMG_SIZE, IMG_SIZE), contour)
mask = filters.median(mask, morphology.disk(10))

perimeter = measure.perimeter(mask)

kernel = np.ones((5, 5), np.uint8)
iterations = ceil(perimeter * 0.005)
reduced_mask = cv2.erode(util.img_as_ubyte(mask), kernel, iterations=iterations)


new_img_eroded = cropped_img * reduced_mask[:, :, np.newaxis]
new_img_eroded = exposure.adjust_gamma(new_img_eroded)
new_img_eroded = exposure.rescale_intensity(new_img_eroded)
new_img_eroded = exposure.equalize_adapthist(new_img_eroded)

new_gray_img_eroded = color.rgb2gray(new_img_eroded)


fig, axes = plt.subplots(2, 2)
ax = axes.flatten()

ax[0].imshow(cropped_img, cmap="gray")
ax[0].plot(init[:, 1], init[:, 0], "--r", lw=2)
ax[0].plot(contour[:, 1], contour[:, 0], "-b", lw=2)
ax[0].set_axis_off()

ax[1].imshow(mask, cmap="gray")
ax[1].set_title(f"Perimeter: {perimeter:.2f}")
ax[1].set_axis_off()

ax[2].imshow(reduced_mask, cmap="gray")
ax[2].set_title(f"num of iterations: {iterations}")
ax[2].set_axis_off()

ax[3].imshow(new_img_eroded)
ax[3].set_axis_off()

plt.show()
