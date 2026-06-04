# printing star pattern 
n=int(input("Enter the value of n: "))
for i in range(n):
    print(" "*(n-i-1),end="") # used to print printing the next print stat in continuation(not in new line)
    print("*"*(2*i+1))
