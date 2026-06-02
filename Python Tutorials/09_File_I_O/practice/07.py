#to make a copy of a text file
with open("donkey.txt") as f:
    content=f.read()
with open("donkey_copy.txt","w") as f:
    content1=f.write(content) # will return the no. of characters in content -- an int value not a string 
    print(content1) # 101
# to match the content of two files
print(content1==content) # false as cntent1 is int and cntent is string value
with open("donkey_copy.txt") as f:
    content2=f.read()
if(content2==content):
    print("These files are identical")
else:
    print("holy shit!")