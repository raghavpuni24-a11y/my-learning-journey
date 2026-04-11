letter = '''Hii |<name>|
You are selected!
|<date>| '''
print(letter.replace("|<name>|","Raghav").replace("|<date>|","24-09-2026") ) # method chaining
#name string is immutable  
letter='''Raghav'''
print(letter)