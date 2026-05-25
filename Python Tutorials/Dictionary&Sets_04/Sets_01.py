s ={1,2,3}  # contains only value- a subset of dictionary -- not indexed, and are unordered
e = set()  # empty set.   
# s={}  --- This is not an empty set, this is an empty dictionary

m={1,23,45,5,5,5} # - repitions are not considered in sets
print(m)  # {1, 5, 45, 23}  - no guarantee of printing in sorted manner

for x in m :
  print(x)  # to print on element in one line
  
print(45 in m) # Membership check
# real world analogy
# for preventing duplications
nums=[1,2,3,4,4,5,5,7,7]
e=set(nums)
print(nums) # 
print(e)
