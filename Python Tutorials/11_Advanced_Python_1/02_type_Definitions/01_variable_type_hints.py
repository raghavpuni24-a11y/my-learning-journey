# Type hints are just hints — not strict rules at runtime -- if you violate their allowed data type , there will be no error -- they are introduced just to increase readability and warn to override something to prevent its original value

age:int = 25
name: str = "Raghav"
gpa: float = 9.1
is_student: bool = True

# proof of type definitions flexibility
age: int = "Raghav"   # No error! Python won't stop you
print(age)             # Raghav
