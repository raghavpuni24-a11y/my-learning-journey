# throw exception if the file doesn't exist
files=["file_1.txt","file_2.txt","file_3.txt"]
for filename in files:
    try:
        with open(filename) as f:
            print(f.read())
    except FileNotFoundError as e: # Exception when don't know which exception will be triggered, otherwise, use FileNotFoundError  
        print(e)
print("Thankyou!")

