class Employee:
    # Concept of abstraction and encapsulation
    @property  # GETTER
    def name(self): # virtual attribute for name -- to get name attribute
        return f"{self.fname} {self.lname}"
    
    @name.setter # SETTER
    def name(self,value):  # name attribute is assigned here
        self.fname=value.split(" ")[0] # split the value string very time u find widesapce " "-- will assign the splitted substrings into a list -- and accessing the substring at 0th index [0]
        self.lname=value.split(" ")[1]
        
e=Employee()
e.name="Raghav Parashar" # triggers setter -- name.setter
print(e.name) # triggers getter -- @property
   