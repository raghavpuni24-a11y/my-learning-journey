class Employee:
    langauge="Python"  # class attributes
    salary=1200000
    
harry=Employee()
harry.name="Harry"  # object attributes / instance attributes
print(harry.name,harry.langauge,harry.salary)

raghav=Employee()
raghav.name="Raghav"
raghav.langauge="Java" # over writing class attribute using instance attribute
print(raghav.name,raghav.langauge,raghav.salary)

    
    
