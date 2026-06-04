print("1] readlines ------------")
f=open("file_03.txt")
lines=f.readlines()  # return a list of the lines
print(lines, type(lines))

print("2] readline -----------------------")
f.seek(0)          # 👈 moves cursor back to beginning,
            # After readlines()  →  cursor is at the END of file 📄➡️[END]
            # readline() now    →  nothing left to read → returns "" empty string

line1=f.readline()
print(line1, type(line1))
line2=f.readline()
print(line2, type(line2))
line3=f.readline()
print(line3, type(line3))
line4=f.readline()  # this will return an empty string,as line3 is the last line
print(line4, type(line4))
# condition to check if the cursor is at the end of the file: 
print(line4=="") # "" is an empty string -- will return true

#  Using loop 
f.seek(0)
print("readline using loop ---------")
line=f.readline()
while(line!=""):
    print(line)
    line=f.readline()

f.close()

