import os

directory_path = r"C:\Users\HP5CD\OneDrive\Documents\My-learning-journey"
# list all files and directories and files in the specified path
contents = os.listdir(directory_path)

for item in contents:
    print(item)