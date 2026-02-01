import numpy as np
print(np.random.random())

print(np.random.random(10))
print(np.random.randint( 1,20))

print(np.random.randint(1,10, size =(2,3 ,4)))
arr = np.array([ 20,4,35,3,30])
print(np.random.choice(arr ,size = 3)) #random array 

print(np.random.shuffle(arr))

print(np.random.permutation(arr))  # randomly array num  in ab

print(np.random.seed(arr)) # same answer any time 

print(np.random.uniform(5 ,10 ,4))
print(np.random.normal(0,1,5))  # where 0 starind , 1 condition ,5 stop 
print(np.random.binomial( n= 20 , p = 0.5 , size = 5))