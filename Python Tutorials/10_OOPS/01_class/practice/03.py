from random import randint

class Train:
    def __init__(self,trainNo,name,fro,to):
        self.trainNo=trainNo
        self.name=name
        self.fro=fro
        self.to=to
    def status(self):
        print(f"The Train {self.name} with Train Number {self.trainNo} from {self.fro} to {self.to} is running on time.")
    def fare(self):
        print(f"The Fare of the Train {self.name} with Train Number {self.trainNo} from {self.fro} to {self.to} is {randint(200,5000)}.")
    @staticmethod
    def greet():
        print('Thankyou have a safe journey!')
jan=Train(22188,"Janshatabdi Express","Bhopal","Jabalpur")
jan.status()
jan.fare()
jan.greet()



