from functools import reduce
l=[1,2,3,4,5]
sum=lambda a,b : a+b 
mul=lambda a,b : a*b
print(reduce(sum,l)) # reduce ( function , arguments/iteratives)
print(reduce(mul,l))
# 1+2=3 , 3+3=6 , 6+4=10, 10+5=15
