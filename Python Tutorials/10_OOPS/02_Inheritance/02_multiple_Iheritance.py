class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"{self.name} is eating 🍽️")


class Flyable:
    def fly(self):
        print(f"I can fly! 🦅") # not using self.name or using "I" in standalone classes because Flyable and Swimmable alone have no guarantee that self.name exists
        # i.e. f=Flyable()
        #      f.fly() ,  and used self.name instead of I with not init const will throw error as they don't have name attribute of their own


class Swimmable:
    def swim(self):
        print(f"I can swim! 🏊")


# Duck inherits from ALL THREE
class Duck(Animal, Flyable, Swimmable):
    def quack(self):
        print(f"{self.name} says Quack! 🦆")


d = Duck("Donald")
d.eat()    # from Animal ✅
d.fly()    # from Flyable ✅
d.swim()   # from Swimmable ✅
d.quack()  # own method ✅
