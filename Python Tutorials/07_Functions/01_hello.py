# greet() --- this will throw error,always call the func after declaring it
def greet():
    print("hello!")
greet()
# with argument
def greet1(name):
    print(f"Good Morning {name}!")
greet1("Raghav")
# return value
print("Return value------------")
def avg(a,b,c,d,e):
    average=(a+b+c+d+e)/5
    return average
print("Average : ",avg(2,3,4,5,6))
#default argument - used by default when no value is passed
print("Default argument------------")
def greet2(name,ending="How are you?"):
    print(f"Good Morning {name}, {ending}")
greet2("Raghav") # when no ending value is passed 
greet2("Puni","Thanks")

