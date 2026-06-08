fruits = ["mango", "banana", "guava", "lichi", "apple", "pineapple", "orange","watermelon"]
# METHOD 1
newlist1=[]
for fruit in fruits:
    if('n' in fruit):
        newlist1.append(fruit.capitalize())
print(newlist1)
print(fruits)  # this will not change

# METHOD 2 - INLINE DEFINITION - LIST COMPREHENSION
newlist2 = [fruit.capitalize() for fruit in fruits if 'n' in fruit ]
print(newlist2)