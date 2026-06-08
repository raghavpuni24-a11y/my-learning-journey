class Complex:
    def __init__(self,r,i):
        self.r=r  # real part
        self.i=i  # img part
    def __add__(self,other):
        return Complex(self.r+other.r, self.i+other.i)
    def __mul__(self, other): # formula :(a+ib) × (c+id) = (ac - bd) + i(ad + bc)
        real=(self.r * other.r) - (self.i * other.i)
        img=(self.r * other.i) + (self.i * other.r)
        return Complex(real,img)
    def __str__(self):
        return f"{self.r}+i{self.i}"
c=Complex(4,5)
d=Complex(6,7)
print(c+d)
print(c*d)

        