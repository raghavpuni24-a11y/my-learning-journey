import math
class Calculator: 
    def __init__(self,n):
        self.n=n
        print(f"Square of {n} : ",n*n)
        print(f"Cube of {n}: ",n*n*n)
        print(f"Square root of {n} : ",n**0.5)  # no import needed
n=Calculator(9)    
print(round(math.sqrt(8),2)) # for square root of a number - using math function
        
        