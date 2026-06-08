l=[1,2,3,4,5,6,7,8,9]
# Method 1 
squared_list=[]
for item in l:
    squared_list.append(item*item)
print("squared_list : ",squared_list)
# Method 2 -LIST COMPREHENSIONS
cubed_list=[(item*item*item) for item in l]
print("cubed_list: ",cubed_list)
# square of odd and even num separately
sq_odd=[(item*item) for item in l if item %2 != 0  ] # sq of only odd numbers -- case when only if exists
sq_even=[(item*item) if item % 2==0 else 0 for item in l ] # Case when both if/else are present
print("sq_even : ",sq_even)
print("sq_odd : ",sq_odd)