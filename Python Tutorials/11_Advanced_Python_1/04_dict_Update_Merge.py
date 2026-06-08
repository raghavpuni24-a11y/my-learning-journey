# to update dicts-------

# 1 .update - older style
print("Using .update -----------")
d1 = { "a":2 ,"b":3 }
d2 = { "c":4 ,"d":5 , "b":6 }
d1.update(d2)  # update elements of d2 in d1 and OVERRIDE if already present
print(d1) # d2 unchanged but d1 updated, updated b took the value of b of d2

# 2] | operator - modern py
print("Using | operator------")
d1 = { "a":2 ,"b":3 }
d2 = { "c":4 ,"d":5 , "b":6 }
d3=d1|d2    # Right side wins always on duplicate keys , here d2's b overrides d1's b
print(d3)

# 3] |= operator - inline merge -- same as .update but more clear abd modern py
d1 = {"a": 1, "b": 2} 
d2 = {"c": 3}
d1 |= d2
print(d1)  # {"a": 1, "b": 2, "c": 3}
