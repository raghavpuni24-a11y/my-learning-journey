a=int(input("Enter numerator: "))
b=int(input("Enter denominator: "))
if(b==0):
    raise ZeroDivisionError("Hey our pgm is not meant to divide the numbers by 0")
# raise is alone here, not with any try-except or with any caller func which has try-exc , so raise crashes the program
else:
    print(f"{a}/{b} = {a/b}")
    