# strings are immutable so
name="Raghav"
print(name[0]) #R
#  name[0]="S" --- TypeError: 'str' object does not support item assignment

# --> List in python- lists are mutable
friends=["apple","orange", 5 , 5.676, True] # can store any type of data 
print(friends[1]) 
# , is not mandatory to define a list having only one element-> [n] is also a list but (n) is not tuple, it is considered as an int data type
n=[] #empty list
print(type(n)) #  <class 'list'>
x=[1]
print(type(x))  #  <class 'list'>
friends[1]="Pineapple"
print(friends[1]) # Pineapple
print(friends)
# Index slicing just like String
print(friends[0:3]) 
friends.append("hey")# append takes exactly one argument- can't append >=2 arguments at a time

# Operations
l1=[1,5,67,3,6,9,34]
l1.sort()
print("sorted list: ",l1)  # [1, 3, 5, 6, 9, 34, 67], now l1 is updated to this
l2=[1,5,67,3,6,9,34]
l2.reverse()# reverse the order of existing list. ->If reverse is applied to l1 then the updated list will be reversed
print(l2) # [34, 9, 6, 3, 67, 5, 1]
l3=[1,5,67,3,6,9,34]
l3.append(89)
print(l3)  # [1, 5, 67, 3, 6, 9, 34, 89]  
l4=[1, 5, 67, 3, 6, 9, 34, 89]
l4.pop(3)# delete 3rd index element, pop is only through index
print(l4)  # [1, 5, 67, 6, 9, 34, 89]
l5=[1, 5, 67, 3, 6, 9, 34, 89]
l5.remove(89)#remove is only by the value
print(l5)
c=[1,4,6,23,90,3,5]
print(min(c),max(c))
l=[1,2,3,4,5]
print(sum(l))

