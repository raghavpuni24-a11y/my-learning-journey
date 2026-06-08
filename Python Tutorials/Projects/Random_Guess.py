from random import randint
ans=True
comp=randint(1,100)
attempts=1
while(ans):
    n = int(input("Guess the number (from 1 to 100) :  "))
    # print("computer guessed : ",comp)
    if(n<comp):
        print("too low!")
        attempts+=1
    elif(n>comp): 
        print("Too high!")
        attempts+=1
    else : 
        print(f"Hurray! You guessed the number in {attempts} attempts ")
        ans=False
    
