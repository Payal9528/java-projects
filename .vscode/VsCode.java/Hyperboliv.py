import numpy as np 
import math 
in_array = [ 0 ,math.pi/2 ,np.pi/3 ,np.pi]
print("Input value : \n " , in_array)
sinh_values = np.sinh(in_array)
print(sinh_values," Hyperbolic sinh \n")

n_array = [ 0 ,math.pi/2 ,np.pi/3 ,np.pi]
print("Input value : \n " , in_array)
cosh_values = np.cosh(in_array)
print(cosh_values," Hyperbolic cosh \n")

n_array = [ 0 ,math.pi/2 ,np.pi/3 ,np.pi]
print("Input value : \n " , in_array)
tanh_values = np.tanh(in_array)
print(tanh_values," Hyperbolic tanh \n")