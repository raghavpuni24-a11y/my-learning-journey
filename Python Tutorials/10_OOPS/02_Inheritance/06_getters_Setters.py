class Employee:
    # Concept of abstraction and encapsulation
    @property  # GETTER
    def name(self): # virtual attribute for name -- to get name attribute -- accessed and assigned just like a ATTRIBUTE not like a method -- refer practice 02
        return f"{self.fname} {self.lname}"
    
    @name.setter # SETTER
    def name(self,value):  # name attribute is assigned here -- can have only one extra parameter as argument other than self
        self.fname=value.split(" ")[0] # split the value string very time u find widesapce " "-- will assign the splitted substrings into a list -- and accessing the substring at 0th index [0]
        self.lname=value.split(" ")[1]
        
e=Employee()
e.name="Raghav Parashar" # triggers setter -- name.setter -- as written in @prop that acc and assgned just like a regular attribute -- this differs @property from regular methods
print(e.name) # triggers getter -- @property 
   