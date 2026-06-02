n=int(input("Enter the number for which you want to generate the multiplication table: "))
def generate(n):
    table ="" # declaring empty string 
    for i in range(1,11):
        table += f"{n} x {i} = {n*i} \n"
    with open(f"tables/table {n}","w") as f:
        f.write(table)
generate(n)
 # if bounded genarate() within a for loop , u can generate tables from 1 to n at once 
        