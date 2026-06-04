class Animal:
    
    def __init__(self,name):
        self.name=name
        print("Constructor of Animal")
        
    def show(self):
        print(f"{self.name} is eating")
        
class Dog(Animal):
    
    def __init__(self, name,breed):
        super().__init__(name)
        self.breed = breed
        print("Constructor of Dog")

    def showBreed(self): # diff method name b/c attributes and methods can't have same name inside the same class 
        print(f"{self.name} is of {self.breed} breed")
        
d=Dog("Tommy","Labrador")
d.show()
d.showBreed()
