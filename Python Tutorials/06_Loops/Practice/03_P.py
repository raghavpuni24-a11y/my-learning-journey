n=int(input("Enter a number: "))
ans=True
for i in range(2,int(n/2)):
    if(n%i==0):
        ans=True
        break
    else:
        ans=False
if(ans):
    print(f"{n} is not a prime number") 
else: 
    print(f"{n} is a prime number")
