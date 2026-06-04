class Employee:
    language="Python"  # class attributes
    salary=1200000
 # SELF CONVENTION ------------------
    def getInfo(self,name): #self must always be the first parameter in any instance method. Python automatically passes the object as the first argument when you call harry.getInfo(harry.name).(more in notes)
        print(f"The name of the Employee is {name}. His language is {self.language}. His salary is {self.salary}") # here self.language has taken Java not python b/c the function is called by the obj harry and harry.language is Java not python(updated as an instance attribute)
    def greet(cr):  # in py, to call a function normally one must use self . self is not a keyword it's a convention. One must use same word (can be anything like cr , we  , u or self) to access a class function
        print("Using self convention : Good Morning!") # without self --def greet() -- will throw error
# STATIC METHODS ------------------
    # to avoid passing the whole object as an argument in methods like greet() where we don't have to or there is no need to access any class's attributes, just to print something of our own,we use static keyword
    @staticmethod 
    def greet1():
        print("Using static method : hey how are you?")
        
harry=Employee()
harry.name="Harry"  # object attributes / instance attributes 
harry.language="Java" # instanc att -- now  the Employee.language is updated for object harry ,i.e Java
print(harry.name,harry.language,harry.salary)
harry.getInfo(harry.name)
harry.greet() # using self
harry.greet1() # using static method