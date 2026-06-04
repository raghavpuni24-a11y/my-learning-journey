import random
round=int(input("How many rounds you want to play? "))
for i in range(1,round+1):
    print(f"Round {i} : ")
    game=["rock","paper","scissor"]
    you=input("Enter your choice: stone , paper or scissor ? : ").lower()
    comp=random.choice(game)
    print("Computer's choice: ",comp)
    if(you in game):
        if(comp==you): print("Its a draw!")
        elif((comp=="rock" and you=="paper") or(comp=="scissor" and you=="rock") or (comp=="paper" and you=="scissor") ):
            print("You won!") 
        else: print('Computer won!')
    else: print("Enter a suitable choice!")
    
 
