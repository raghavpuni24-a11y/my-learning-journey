class Employee:
    language = "Python" # This is a class attribute
    salary = 1200000
    def __init__(self): # dunder method -- Constructor
        print("Dunder method called -- Constructor called -- Hello")
    def getInfo(self):
        print(f"The language is {self.language}. The salary is {self.salary}")
    @staticmethod
    def greet():
        print("Good morning")

harry = Employee() 
harry.name = "Harry"
print(harry.name, harry.salary)
rohan=Employee()

class Student:
    # branch="AIDS"
    # sem = 4 ---- can declare them here but since only some records will be for branch and sem other than AIDS and 4th, we can declare it right in the parameters , as if we want to pass the branch or sem explicitly , we have to pass argument as branch and sem everytime we create obj
    def __init__(self, name , branch="AIDS",sem=4): # to avoid passing the argument even if defined as class att b/c what if i want to store data of st from another branch and year for any other work, maybe, so the unique passed argument will override the default parameter
        self.name=name # just like this.name=name
        self.branch=branch
        self.sem= sem
    def getInfo(self):
        print(f"Name : {self.name} -- Branch : {self.branch} -- Semester : {self.sem}")
    # WHY self.name and not just name? ---- 
        #  print(name)           # 💥 ERROR — which 'name'?? Python has no idea!name is considered as local variable of that function, which doesn't exist here in this method.
        #print(self.name)      # ✅ correct — explicitly telling Python where to look -- look for the passsed argument as variable
st1=Student("Raghav")
st1.getInfo()
st2=Student("Akshansh","CSE",6)
st2.getInfo()
