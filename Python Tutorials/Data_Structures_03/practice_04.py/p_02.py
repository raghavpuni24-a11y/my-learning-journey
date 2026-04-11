# 2nd
marks=[]
print("Enter the marks: ")
for i in range(6):
    m=int(input(f"Enter marks{i+1}: ")) # first convert the input string type to int type
    marks.append(m)
s = marks.sort() # will return None, so can't be directly printed, it will just print None
print(s)  # None , as s cantains None , not the sorted list
# Right way to sort
print(sorted(marks)) # to sort in and print directly
# OR
marks.sort()
print(marks) 
