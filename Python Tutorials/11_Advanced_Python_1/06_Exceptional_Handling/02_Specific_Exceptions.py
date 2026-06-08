# we can give output as exceptions for some particular exc
try:
    n=int(input("Enter a number : ")) 
except ValueError as v:
    print("This is a Value error hence is handled by Value error exc block ")
    print(v)
    print("Hey") # every code in a block will run iff the exc occurs
except Exception as e: # if the exc that is occuring is not specified particularly, then only it will be handled by Exception block - The superset of all the Exceptions
    print(e)
print("Thankyou!") 