a=10 # int
b=12.234 # float
c="Raghav" # String
d= False #boolean
e=None
f=type(a) 
g=type(b)
h=type(c)
i=type(d)
j=type(e)
print("first method: ")   
print(type(a), type(b), type(c), type(d), type(e))
print(f,g,h,i,j)# or like this
#Other easy way
print("second method: ")
a=12
print(f"the value of a^2 is:{a*12}")  # format specifier
print(f"{type(a)} {type(b)} {type(c)} {type(d)} {type(e)}") 

print("third method: ")
print(type(a), type(b), type(c), type(d), type(e), sep="\n") # to print each one in new line. sep = separator between each value. By default it's a space, you can change it to anything — \n, -,or any character, it will be dislayed same as a string b/w them to separate them.
