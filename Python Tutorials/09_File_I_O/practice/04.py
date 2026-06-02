# refer notes for truncate() catch
with open("donkey.txt","r+") as f: # usin truncate - for larger files
    content=f.read()
    newcontent=content.replace("donkey","kittin")
    f.seek(0)
    f.truncate() #  use truncate for strings shorter than the st to be replaced 
    f.write(newcontent)
# using separate read and write modes, for smaller files
with open("donkey.txt") as f:
    content = f.read()
newcontent=content.replace("cow","buffalo")
with open("donkey.txt","w") as f:
    f.write(newcontent)