from os import path
from skimage import io, transform, color, exposure, util, filters, morphology, segmentation, feature
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

# seed = np.copy(cropped_img)
# seed[1:-1, 1:-1] = cropped_img.max()
# mask = cropped_img

# eroded_color = morphology.reconstruction(seed, mask, method="erosion")

# no_bg_color_img = eroded_color - cropped_img
# inv_no_bg_color_img = util.invert(no_bg_color_img)

# no_bg_color_img = exposure.rescale_intensity(no_bg_color_img)
# no_bg_color_img = exposure.equalize_adapthist(no_bg_color_img)

# inv_no_bg_color_img = exposure.rescale_intensity(inv_no_bg_color_img)
# inv_no_bg_color_img = exposure.equalize_adapthist(inv_no_bg_color_img)

grayscale_img = color.rgb2gray(cropped_img)

seed = np.copy(grayscale_img)
seed[1:-1, 1:-1] = grayscale_img.max()
mask = grayscale_img

eroded = morphology.reconstruction(seed, mask, method="erosion")

no_bg_img = grayscale_img - eroded

no_bg_img = exposure.rescale_intensity(no_bg_img)

# inv_no_bg_img = util.invert(no_bg_img)
# inv_no_bg_img = exposure.equalize_adapthist(inv_no_bg_img)

threshold = filters.threshold_yen(no_bg_img)
kernel = np.ones((5, 5), np.uint8)

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

eroding = cv2.erode(mask2, kernel, iterations=6)

new_img_eroded = cropped_img * eroding[:, :, np.newaxis]
new_img_eroded = exposure.adjust_gamma(new_img_eroded)
new_img_eroded = exposure.rescale_intensity(new_img_eroded)
new_img_eroded = exposure.equalize_adapthist(new_img_eroded)

new_gray_img_eroded = color.rgb2gray(new_img_eroded)

pixel_values = filters.median(new_img_eroded)
pixel_values = util.img_as_float32(pixel_values)
pixel_values = pixel_values.reshape((-1, 3))

k = 2
_, labels, centers = cv2.kmeans(
    pixel_values, k, None, (cv2.TERM_CRITERIA_EPS + cv2.TERM_CRITERIA_MAX_ITER, 100, 0.2), 15, cv2.KMEANS_RANDOM_CENTERS
)

segmented_image = centers[labels.flatten()]
segmented_image = segmented_image.reshape(new_img_eroded.shape)
segmented_image = util.img_as_ubyte(segmented_image)

egded = filters.sobel(color.rgb2gray(segmented_image))
egded = util.img_as_ubyte(egded)

contours, _ = cv2.findContours(egded, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

contours_filtered = [contour for contour in contours if cv2.contourArea(contour) >= 100]

contour_img = util.img_as_ubyte(np.copy(new_img_eroded))
cv2.drawContours(contour_img, contours, -1, (255, 0, 0), 1)

contour_filtered_img = util.img_as_ubyte(np.copy(new_img_eroded))
cv2.drawContours(contour_filtered_img, contours_filtered, -1, (255, 0, 0), 1)

fig, axes = plt.subplots(2, 2)
ax = axes.flatten()

ax[0].imshow(cropped_img)
ax[0].set_axis_off()

ax[1].imshow(new_img_eroded)
ax[1].set_axis_off()

ax[2].imshow(contour_img)
ax[2].set_axis_off()

ax[3].imshow(contour_filtered_img)
ax[3].set_axis_off()

plt.show()
