try:
    # code which might throw exception
    n=int(input("Enter a number : ")) # if entered other than int number, it will crash and throw error
except Exception as e:
    print(e)
print("Thankyou!")  # this will run even after giving the exceptions, thus assuring the pgm will not crash 
