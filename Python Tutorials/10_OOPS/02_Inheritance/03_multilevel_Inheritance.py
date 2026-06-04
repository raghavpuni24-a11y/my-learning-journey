class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"{self.name} is eating 🍽️")


class Dog(Animal):          # level 2 — inherits Animal
    def bark(self):
        print(f"{self.name} says Woof! 🐶")


class BabyDog(Dog):         # level 3 — inherits Dog (which has Animal too)
    def weep(self):
        print(f"{self.name} is weeping 😢")


b = BabyDog("Tommy")
b.eat()     # from Animal ✅
b.bark()    # from Dog ✅
b.weep()    # own method ✅