#   using walrus and ternary, take input and filter the elements simultaneously into sq_odd and sq_even as the input is even or odd and print the respective list in MINIMAL LINES POSSIBLE
sq_even, sq_odd=[], []
[ sq_even.append(n*n) if((n:=int(input("Enter your number : "))) %2 ==0) else sq_odd.append(n*n) for i in range(int(input("How many numbers : "))) ]

print("Sq_Even_List = ",sq_even)
print("Sq_Odd_List = ",sq_odd)
    
        