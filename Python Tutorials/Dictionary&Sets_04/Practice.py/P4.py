language={}
for i in range(5):
 namei =input("Enter friend's name: ")
 langi=input("Enter fav language: ")
 language.update({namei:langi})
print(language) 
#try with updating the fav lang by over-writing the lang in the same friend key, it will update and will take the latest value
#Keys will update and values can be same for diff keys