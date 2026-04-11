marks ={    
    "Rollno": [1,2,3,4],   #   key : value
    "Hiroshi": 50,   #  Hiroshi contains the value 50, so 50 can only be accessed by specifying Hiroshi, vive-versa is not possible and will give Key-Error - check line 16 and 17
    "Giyan": 78,
    "Sunio": 45,
    "Dekisuki": 89,
    77: "Nobita",
    12: 90,
    343.56 : "Shinosuke"
}
print(marks)
print(type(marks))  # <class 'dict'>
print(marks["Giyan"])  #78 --- will print the value corresponding to the key "Giyan"
# Dictionaries are indexed but don't have indexing property like list or tuples to print the value of that index like: 
#print(marks[2])---- this will give keyError and will NOT print value corresponding to 2nd index , like :   "Sunio": 45 , this is prohibited in dicts
print(marks["Rollno"]) 
print(marks[77])  # here 77 and 12(Below) are not indexes, these are the keys in the marks dict and this will print value  coresponding to key 77 (not index 77)- not an indexing property like in list or tuple
print(marks[12])
print(marks[343.56])
# Updation
marks.update({"Dekisuki": 99, "Harry":78})  # if Dekisuki is in the dict marks, it will get updated and here, Harry will be inserted/ added in the dict
print(marks)
# .get()
print(marks.get("Harry"))
print(marks.get("Giyan1"))  #  prints None  - more safer than marks[] -- doesn't give error
print(marks["Giyan1"])   #  give Key Error
  