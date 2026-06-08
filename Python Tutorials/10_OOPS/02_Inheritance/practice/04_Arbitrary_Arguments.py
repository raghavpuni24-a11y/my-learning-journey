# to print the length of a given vector, can be done through list and by *args -- tuples
class length_Of_Vector:
    def __init__(self,*args): # arbitrary argument
        self.components=args  # stored as tuple internally
    def __len__(self):
        return len(self.components)
    def __str__(self):
        return f"Vector : {self.components}"
v1=length_Of_Vector(1,2,6,7)
print(len(v1))
print(v1)