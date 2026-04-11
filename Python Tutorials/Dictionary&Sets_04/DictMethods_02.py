student={
    "Name":"Raghav",
    "Age": 20,
    "Branch":"AIDS",
    "City":"Bhopal",
    "Session":2028,
}
# .get() - safer than student[key] as if the key doesn't present in the dict, then it will just print None instead of getting crashed and giving key Error
print(student.get("Session"))

print(student.keys()) # returns a live view of all keys,"live" means if you add a key later, the view auto-updates
print(list(student.keys()))# for a plain list

print(student.values())
print(list(student.values()))
print(2028 in student) # only true for the keys if they exist, always false for the values
print("Raghav" in student.values()) # to check the existence in values
print("AIDS" in student.values())

print(student.items()) # name + number together - in form of tuples

student.update({"lang":"Java","Rollno":106}) # existing ones get overwritten, new ones get added
extra={"cllg":"TIT","room":113}
student.update(extra) # another way
print(student)

removed=student.pop("cllg","TIT") # giving both key and value
print(removed)
print(student.pop("lang","alpha")) # focuses only on the key not on the value so , the value of key "lang" is printed("Java"), and alpha, despite not existing in the dict, gets ignored , giving no error
print(student.pop("city","Bhopal"))# looks for presence of the key 'city', if not present , never touches the dict and just prints the default or 2nd value u have written- the default case for safer and alertive execution
print(student)# to check for the deleted values

pair=student.popitem() # removes & returns the last inserted pair as a tuple
print(pair)
print(student)




