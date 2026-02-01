import numpy as np 
arr = np.arange(1,6)
print(arr)

# using np.linspace
a = np.linspace(1,10,5)
print(a)

print(arr.shape)
print(arr.size)
print(arr.ndim)
print(arr+5)

list = ( 5,20,70)   #conver list to array
print(np.array(list))