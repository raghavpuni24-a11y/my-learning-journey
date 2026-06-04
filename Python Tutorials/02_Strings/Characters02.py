name=     "Raghuvendra"
       #   012345678910 -- index of characters , since string is a collection of characters
       # negative slicing- last index = -1 and index goes on to decrease by -1
print( name[0:5])# print characters from index 0 to index 4(index 5 is excluded) 
print( name[4]) # print the 4th character
# Negative slicing
print( name[-7:-2]) # not name[-2:-7] b/c it can't print string in reverse order,i.e., it can only be printed from the foremost index -7 to the leading index -2 in normal order ut the inverse will be to print in it reverse which is restricted 

# Other properties--- 1
print( name[:]) # means index 0 to length
print( name[:6]) # means index 0 to 6
print(name[4:]) # means index 4 to length

#other properties--- 2
a ="0123456789"
print(a[1:8:2])# start from index 0 and go till 8(exclude 8) AND print by maintaining a gap of 2 indexes, ie.,print the 2nd index element from that index(here only) ---- 1357