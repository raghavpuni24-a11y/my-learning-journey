clDate=[9,"April",2026]  #  Also for tuples
#There are 3 items in the tuple. So Python lets you grab all 3 at once into 3 separate variables — left side must match the count exactly. And the variable's type will exactly match with  data type 
date,month,year=clDate
print(date,month,year)
print(type(month)) #<class 'str'>
#Star unpacking 
yuhu=(1 ,2 ,4 ,"hello", 8 , True)
a,*b,c=yuhu # *b will ALWAYS becomes a list
print(a,b,c) # not *b, only the variable as * is only to pack those elements in a list or to make the variable a listtype variable
