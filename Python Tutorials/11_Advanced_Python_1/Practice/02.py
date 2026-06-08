'''Take n strings as input from user.
Separate them into:
  → long_words  : length > 5
  → short_words : length <= 5

Use walrus + ternary + list comprehension
Minimal lines possible.'''

long_words,short_words=[],[]
[ short_words.append(word) if len(word := input("Enter your string : ")) <= 5 else long_words.append(word) for i in range(int(input("How many strings : "))) ]

print("long words: ",long_words)
print("short words: ",short_words)
    
    