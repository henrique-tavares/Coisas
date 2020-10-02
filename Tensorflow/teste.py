from os import path
from skimage import io, transform, color, exposure, util, filters, morphology
from numpy import copy

# from matplotlib import pyplot as plt

img = io.imread(path.join(path.curdir, "pequis", "01.jpg"))

print(img.shape)

new_scale = 512 / img.shape[0]

rescaled_img = transform.rescale(img, new_scale, multichannel=True, anti_aliasing=True)

print(rescaled_img.shape)

cropped_img = rescaled_img[:, int((rescaled_img.shape[1] - 512) / 2) : int(512 + (rescaled_img.shape[1] - 512) / 2)]

print(cropped_img.shape)


# for channel in range(treated_img.shape[2]):
#     treated_img[:, :, channel] = filters.rank.median(treated_img[:, :, channel])


# treated_img = filters.gaussian(cropped_img, sigma=1, multichannel=True)
# treated_img = exposure.adjust_gamma(treated_img)
# treated_img = exposure.rescale_intensity(treated_img)
# treated_img = color.rgb2hsv(treated_img)
inverted_img = util.invert(cropped_img)

seed = copy(inverted_img)
seed[1:-1, 1:-1] = inverted_img.min()

dilated = morphology.reconstruction(seed, inverted_img)
background_removed = inverted_img - dilated
background_removed_inverted = util.invert(background_removed)

treated_img_inverted = exposure.adjust_gamma(background_removed_inverted)
treated_img_inverted = exposure.rescale_intensity(treated_img_inverted)
median_img_inverted = filters.median(treated_img_inverted)

hsv_img_inverted = color.rgb2hsv(treated_img_inverted)
hsv_median_img_inverted = color.rgb2hsv(median_img_inverted)

treated_img = exposure.adjust_gamma(background_removed)
treated_img = exposure.rescale_intensity(treated_img)
median_img = filters.median(treated_img)

hsv_img = color.rgb2hsv(treated_img)
hsv_median_img = color.rgb2hsv(median_img)

io.imshow_collection(
    [
        cropped_img,
        background_removed,
        treated_img,
        hsv_img,
        median_img,
        hsv_median_img,
        background_removed_inverted,
        treated_img_inverted,
        hsv_img_inverted,
        median_img_inverted,
        hsv_median_img_inverted,
    ]
)
io.show()
