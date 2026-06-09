n = int(input("Enter a number: "))
table = [str(n * i) for i in range(1, 11)] # str(n*i) as join only takes str inputs
s = "\n".join(table)
print(s)