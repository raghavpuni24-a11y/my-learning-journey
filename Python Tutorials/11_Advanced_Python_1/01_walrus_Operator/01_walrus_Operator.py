 # without walrus
x=10 
if x==10:
    print(x)
    
#with walrus  ---  :=
# 1 
if (x:=8):  
    print(x)
# 2
if((x:=int(input("Enter a number : "))) > 5 ):   
    print(f"{x} > 5")
else:
    print(f"{x} < 5")
# 3
print(f"{x} is an even number ") if((x:=int(input("Enter a number : "))) % 2 ==0 ) else print(f"{x} is an odd number")  

 