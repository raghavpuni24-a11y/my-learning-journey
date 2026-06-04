'''
* * * 
*   *
* * *
'''
n=int(input("Enter your number: " ))
for i in range(1,n+1):
    print("*",end="" )
    if(i!=1 and i!=n ):
        print(" "*(n-2),end="")
    else:
        print("*"*(n-2),end="")
    print("*")
    
