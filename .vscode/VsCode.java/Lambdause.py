# even odd cheking 
x = int(input("enter checking number :"))
even_odd = lambda x: "Even" if x % 2==0 else "Odd"
print(even_odd(x))

#map() using lambda 
num = [1,3,5,3,4,5]
result  = list(map(lambda x : x*x , num))
print(result)
result = list(map(lambda x: x**x , num ))
print(result)

#filter()
num = [4,6,4,7,5,3,4,5,6,0,8,6,4,5,6,78,67,5]
Even = list(filter(lambda x: x%2 ==0 ,num))
Odd = list(filter(lambda x: x%3 , num))
print(Even)
print(Odd)

#sorted
num = [ 3,5,34,6,8,4,5,6,4,5,7,5,7,5,66,79,67,5,6,6,74,5]
result = sorted(num , key=lambda x: x)
print(result)
