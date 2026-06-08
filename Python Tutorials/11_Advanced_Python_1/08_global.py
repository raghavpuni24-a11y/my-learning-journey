a=90
def show():
    a=3
    print(a)
print(a) # 90
show() # 3
print(a) # 90
print("----------------------") 
 # to change the global var a(here) and assign it to the local var value(a in show) 
b=50
def show():
    global b
    b=5
    print(b)
print(b) # 50
show() # 5
print(b) # 5 not 50, -- global assigned the value of local var to the global var