# Normal = way — repetition problem
# name = input("Name: ")
# while name != "stop":       -- # if name=="stop" while terminates
#     print("Hello", name)
#     name = input("Name: ")          -- # have to write input() TWICE 😩

# Walrus := way — clean ✅
while( (name := input("Enter your name : ")) != "stop" ):
    print("hello", name)
print(name)  # name is available even after while loop terminated but here it will always contain "stop" as the terminating condn of while loop here
print("Practicing while loop walrus")
