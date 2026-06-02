import random
def game():
    print("You are playing a game: ")
    score =random.randint(1,100)
    print(f"Your score is {score}")
    # fetching the score from file
    with open("hiscore.txt") as f:
        hiscore=f.read()
        if(hiscore!=""):
            hiscore=int(hiscore) # as f.read() returns a string
        else:
            hiscore=0
        print(f"highest score is: {hiscore}")
    # comparing the highest score and assigning the value
    if(score>hiscore):
        print(f"Your new high score is : {score}")
        with open("hiscore.txt","w") as f:
            f.write(str(score))
    return score
game()
        
    