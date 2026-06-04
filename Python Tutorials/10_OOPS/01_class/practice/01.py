class Programmer:
    company="Microsoft"
    def __init__(self,name,salary,pincode):
        self.name=name
        self.salary=salary
        self.pincode=pincode
    def getInfo(self):
        print(f"Company : {self.company} -- Name : {self.name} -- Salary : {self.salary} -- Pincode : {self.pincode}")
        
r=Programmer("Raghav",1200000,462026)
r.getInfo()


        