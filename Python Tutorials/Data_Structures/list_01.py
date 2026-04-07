# strings are immutable so
name="Raghav"
print(name[0])
#  name[0]="S" --- TypeError: 'str' object does not support item assignment

# --> List in python- lista are mutable
friends=["apple","orange", 5 , 5.676, True]# can store any type of data 
print(friends[1]) 
friends[1]="Pineapple"
print(friends[1])
# Index slicing just like String
print(friends[0:3])
friends.append("hey",69)
print
