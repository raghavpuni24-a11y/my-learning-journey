# to remove the usage of f.close every time reading a file
with open("file_01.txt") as f:
    print(f.read())
# no need to close the file explicitly