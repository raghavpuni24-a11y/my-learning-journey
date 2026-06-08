class two_D_Vector:
    def __init__(self,i,j):
        self.i=i
        self.j=j
    def show(self):
        print(f"The 2 D Vector is ({self.i},{self.j})")
class three_D_Vector(two_D_Vector):
    def __init__(self, i, j,k):
        super().__init__(i, j)
        self.k=k
    def show(self):
        print(f"The 3 D Vector is ({self.i},{self.j},{self.k})")
a=two_D_Vector(1,2)
a.show()
b=three_D_Vector(3,4,5)
b.show()
    