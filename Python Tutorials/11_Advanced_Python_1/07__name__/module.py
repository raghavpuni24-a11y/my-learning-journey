# evaluates to the name of the module in py from where the pgm is ran
def func():
    print("Hello from module")
func()
print(__name__)  # if running from the same file it is present in -- __main__
                 # otherwise if importing it to another file, then running it from there will print the name of the file from where it is being imported( here module)
print("----------------")
if(__name__ =="__main__"):  # if this code is directly executed by running the file it is currently present in
    func()
    print(__name__) 
    print("We are directly running this code")
else:
    print("Running from another file")