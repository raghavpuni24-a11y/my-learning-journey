words=["rascal","shit","idiot","slut"]
with open("censored.txt","r+") as f:
    content=f.read()
    for word in words:
        content=content.replace(word,"#"*len(word))
    f.seek(0)
    f.truncate()
    f.write(content)