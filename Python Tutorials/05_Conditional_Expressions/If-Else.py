age=int(input("Enter your age: "))
if(age>=18):
    print("You are welcome!!")
elif(age<0):
    print("You are entering an invalid age!")
else:
    print("You are below the concent age!")

#With 'and' and 'or'
num=int(input("Enter a number : "))
if(num%2==0 and num>0):
    print(f"{num} is a natural and even number")
elif(num%2!=0 and num>0):
    print(f"{num} is an odd and natural number")
else:
    print("Else condn")
if(num >1 or num>0):
    print(f"{num} is a whole number")

