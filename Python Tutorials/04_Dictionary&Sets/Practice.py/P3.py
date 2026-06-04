s=set()
s.add(18)  #  an int value
s.add('18')  # an string value
s.add("18") # still an string value, doesn't reflect in s set
print(s)

a=set()
a.add(20)
a.add(20.0) # both values-20 and 20.0 are same inspite of diff data types in python so len will be 2
a.add('20')
print(len(a))
print(a)

b={}
print(type(b))
c=set()
print(type(c))