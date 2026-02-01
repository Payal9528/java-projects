import numpy as np
arr = np.array([10,30,20,70,30,60,50,0,0])
index = np.where(arr < 25)
print(index)
print(np.where( arr == 30))  # find place 30 
print(np.searchsorted( arr , 30)) # find place
print(np.nonzero(arr)) # find none  zero place
#BOOLEAB\N SEACHING 
print(arr[arr > 30])  # greater than 30
