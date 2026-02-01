import numpy as np
arr = np.array([1,7,34,5,8,9,35,6])
print(np.sort(arr))
print(np.sort(arr)[:: -1])  # acending 
a = np.array([[1,4,3,5],
              [5,7,4,5]])
print(np.sort(a , axis = 1))  #row wise 
print(np.sort(a, axis = 0))  #col wise

print(np.argsort(a))  #return possition
marks = np.array([20,90,45,96])
roll = np.array([1,5,3,6])

print(np.lexsort((marks,roll)))