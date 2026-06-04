# 2nd
marks=[] # list
print("Enter the marks: ")
for i in range(6):
    m=int(input(f"Enter marks{i+1}: ")) # first convert the input string type to int type
    marks.append(m)
s = marks.sort() # will return None, so can't be directly printed, it will just print None or s will store None in it
print(s)  # None , as s cantains None , not the sorted list
print(marks.sort()) # None as sort() just returns None
# Right way to sort to print the sorted list inplace
print("printing marks by sorted()- ",sorted(marks)) # to sort in and print directly
# OR
marks.sort() # this will actually sort the list in place-will update the actual list and NOT creates a new one leaving the former untouched
print("printing marks by sort()-" ,marks) # will print the sorted UPDATED list
