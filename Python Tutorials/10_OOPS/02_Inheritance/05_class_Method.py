# to access classa attributes over provided instance attribute
class Color:
    colour="red"
    def __init__(self,colour):
        self.colour=colour
    def show(self):
        print(f"Colour of unripe apple is {self.colour}")
    @classmethod # to access class attribute
    def showRipe(cls):
        print(f"Colour of ripe apple is {cls.colour}")
a=Color("green")
a.show()
a.showRipe()
        