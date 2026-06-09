l=[1,2,3,4,5,6,7,8,9,10]
def even(n):
    if n%2==0:
        return True
    return False
even_list_map=map(even,l) # evalautes every value
even_list_filter=filter(even,l) # evaluates only truthy values and rejects falsy ones
print(list(even_list_map))  
print(list(even_list_filter))