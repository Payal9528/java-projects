import imageio.v3 as iio
import numpy as np

imag = iio.imread('raccpn.png')
print("Shape of Image: ", imag.shape)
print("Data type of Image: ", imag.dtype)
