# if func return soemthing ---  ->datatype
# Type hints are just hints — not strict rules at runtime -- if you violate their allowed data type , there will be no error -- they are introduced just to increase readability and warn to override something to prevent its original value

def greet(name:str) ->str :
    return f"hello {name}"
a=greet("Raghav")
print(a)

# if func return nothing then None
def show(x: int) -> None:
    print(x)
show(9)