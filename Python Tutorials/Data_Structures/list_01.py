# strings are immutable so
name="Raghav"
print(name[0])
#  name[0]="S" --- TypeError: 'str' object does not support item assignment

# --> List in python- lista are mutable
friends=["apple","orange", 5 , 5.676, True]# can store any type of data 
print(friends[1]) 
# , is not mandatory like in  tuples
x=[1]
print(type(x))  #  <class 'list'>
n=[] #empty list
print(type(n))
friends[1]="Pineapple"
print(friends[1]) # Pineapple

# Index slicing just like String
print(friends[0:3])
friends.append("hey")# append takes exactly one argument

# Operations
l1=[1,5,67,3,6,9,34]
l1.sort()
print(l1)  # [1, 3, 5, 6, 9, 34, 67], now l1 is updated to this
l2=[1,5,67,3,6,9,34]
l2.reverse()# reverse the existing list. If reverse is applied to l1 then the updated list will be reversed
print(l2) # [34, 9, 6, 3, 67, 5, 1]
l3=[1,5,67,3,6,9,34]
l3.append(89)
print(l3)  #[1, 5, 67, 3, 6, 9, 34, 89]
l4=[1, 5, 67, 3, 6, 9, 34, 89]
l4.pop(3)# delete 3rd index element, pop is only for index
print(l4)  #[1, 5, 67, 6, 9, 34, 89]
l5=[1, 5, 67, 3, 6, 9, 34, 89]
l5.remove(89)#remove is only by the value
print(l5)
c=[1,4,6,23,90,3,5]
print(min(c),max(c))
