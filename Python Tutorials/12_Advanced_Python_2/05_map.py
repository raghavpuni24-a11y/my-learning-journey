# working of map-- Apply this function to every item in this list or any structure which can be iterated -- map
# If you can loop over it with for → map can work on it ✅

l=[1,2,3,4,5]
square=lambda x : x*x

# classical method: without map
    # sqList=[]
    # for item in l:
    #     sqList.append(square(item))

sqList = map(square,l) #  map returns a map object
#  map(function, iterable)
#        ↑           ↑
#   what to do    what to do it ON
print(list(sqList)) # converting that map obj into list

# CAN BE DONE WITH LIST COMPREHENSIONS, DIFF IN NOTES
#list comp way:
#   sqList=[x*x for x in l]

# More examples

# tuple
print(list(map(square, (1, 2, 3))))
print(square)

# string characters
print(list(map(str.upper, "hello")))   # → ['H','E','L','L','O']

# set
print(list(map(square, {1, 2, 3})))

# range
print(list(map(square, range(1, 6))))
