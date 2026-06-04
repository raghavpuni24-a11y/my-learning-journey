total_marks=0
for i in range(4):
    marks=int(input(f"Enter your marks {i}: "))
    total_marks+=marks
total_percentage=(total_marks)/4
print(total_percentage)
if(total_percentage>=40):
    print("Pass")
else:
    print("Fail")
    