l=[3,45,678,232]

# cumbersome process
# index=0
# for item in l:
#     print(f"The item at index {index} is {item}")
#     index+=1

# using enumerate
for index,item in enumerate(l):
    print(f"The item at index {index} is {item}")
print("--------------------")
# custom enumerate
for index,item in enumerate(l,start=1): # for custom indexing
    print(f"The item at index {index} is {item}")
    


