n=[0,1,2,3,4,5]

# normally  -- for undestanding purpose only
num = len(n)
if(num > 3):
    print("Length of the list is greater than 3")
print(num)  

# with walrus
if( (num1:=(len(n))) >4 ):
    print("Length of the list is greater than 4")
print(num1)  # available after the if line too 