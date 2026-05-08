# tuples are immutable, just the opposite of lists , same indexing
a=(1,2,3,"Riddhi", 4.56,True,1) 
print(a)
# , is mandatory to define a tuple with only 1 element, otherwise it is treated as int data type
n=()  # empty tuple
print(type(n)) #<class 'tuple'>
b=(9)  # this is why , is mandatory for only 1 element tuple
print(type(b)) #<class 'int'>
c=(9,)
print(type(c)) #<class 'tuple'>
