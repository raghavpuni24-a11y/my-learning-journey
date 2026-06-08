class Employee:
    def __init__(self,salary, increment):
        self.salary=salary
        self.increment=increment
        self.fsalary=self.salary+self.increment
    @property
    def salary_After_Increment(self):
        self.salary_After_Increment=self.salary
        return self.fsalary
    @salary_After_Increment.setter
    def salary_After_Increment(self,value):
        self.fsalary=value
    
e1=Employee(2345,400)
print(e1.salary_After_Increment)
e1.salary_After_Increment = 5000
print(e1.salary_After_Increment)
        