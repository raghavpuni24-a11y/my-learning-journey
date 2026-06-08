try:
    # code which might throw exception
    n=int(input("Enter a number : ")) # if entered other than int number, it will crash and throw error
except Exception as e:
    print(e)
else:
    print("Inside else block, will only run when try executes successfully, but will not run if produced any exception") # this will only run iff the pgm is executed without generating any exceptions in the try block
print("Hey") # else is not like this