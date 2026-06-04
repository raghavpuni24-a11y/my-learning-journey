class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"{self.name} is eating 🍽️")

    def breathe(self):
        print(f"{self.name} is breathing 🌬️")


class Dog(Animal):             # Dog inherits from Animal
    def bark(self):
        print(f"{self.name} says Woof! 🐶")


class Cat(Animal):             # Cat inherits from Animal
    def meow(self):
        print(f"{self.name} says Meow! 🐱")


# usage
d = Dog("Bruno")
d.eat()        # inherited ✅
d.breathe()    # inherited ✅
d.bark()       # own method ✅

c = Cat("Kitty")
c.eat()        # inherited ✅
c.meow()       # own method ✅
