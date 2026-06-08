class Vector:
    def __init__(self,i,j):
        self.i=i
        self.j=j
    def __add__(self, other):  # overloading the + operator
        return Vector(self.i + other.i,self.j+other.j)  # stored as a Vector class object
    def __str__(self):  # printing the object Vector(4,6) as  a string
        return f"({self.i},{self.j})"
v1=Vector(1,2)
v2=Vector(3,4)
print(v1+v2) 
res=v1+v2
print(type(res))
print(res.i)
print(res.j)