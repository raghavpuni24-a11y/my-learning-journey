list=["Harry","Rashi","Raghav","Prince","Vanshika"]
username=input("Enter your username: ")
if(username in list):
    print("Already in the list!")
else:
    list.append(username)
    print("List updated!")