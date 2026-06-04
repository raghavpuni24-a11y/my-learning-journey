s={1,2,3}
# ADD - never duplicates in set
print("---add-----")
s.add(4)
print(s)
s.add(2)# already exist-nothing happens
print(s)
#REMOVE - strict b/c give keyError and crashes if the to-be-removed element is not in the set
print("---remove-----")
s.remove(2)
print(s)
#  s.remove(99) ---- KeyError
#DISCARD - chill mode of remove
print("---discard-----")
s.discard(3)
s.discard(99)
print(s)
#UNION -- combine both sets, duplicates kicked out,  works with any iterable,not just with sets
print("---union-----")
a={1,2,3}
b={3,4,5,6}
print(a.union(b)) 
c=b.union(a)
print(c)
print(a|b) # shortcut operator-- same as union-- works only with sets
#example for union and |
c=[1,2,3,"Ahana",9.898,"ijio"]
d={4,5.6,7,"ijio"}
print("union-",d.union(c)) # point--only should be applied with set -- d must be a set, not any other ds
 # print(" | -- ",c|d) --- Type Error
# INTERSECTION -- only common elements
    # a={1,2,3}
    #b={3,4,5,6}
print("---intersection-----")
print(a.intersection(b))
print(d.intersection(c))
print(a&b) #shortcut operator
#DIFFERENCE -in A but not in B
print("---difference-----")
print(a.difference(b))
print(b.difference(a))
print(a-b)# shortcut operator
# SYMMETRIC DIFFERNCE - in either but not both-- leaving out common elements
print("---symmetric_difference-----")
print(a.symmetric_difference(b))
print(a^b)

