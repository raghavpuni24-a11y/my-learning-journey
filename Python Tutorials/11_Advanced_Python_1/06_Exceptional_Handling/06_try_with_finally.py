# finally is used mainly inside functions where we want to run the code EVEN AFTER RETURN STATEMENT
# we have learned that whenever the return statement gets exceuted , code after it never runs but to override return finally is used
def main():
    try:
    # code which might throw exception
        n=int(input("Enter a number : ")) # if entered other than int number, it will crash and throw error
        return n
    except Exception as e:
        # print(e)
        return e
#CATCH---  # print("Thankyou main")  -- If this is written here, finally will not run, b/c the compiler will take finally as normal statement 
    finally: # always runs
        # only runs when nothing is written between finally block and except block
        print("Thankyou user!")
    print("Thankyou main") # this will never run
print(main())