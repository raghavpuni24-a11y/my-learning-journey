package OOPS.Super.Constructor;

public class Main {
    public static void main(String[] args) {
        Employee e=new Employee(106,"Raghav",5000000f);
        e.display();

    }
}
                                    
class Person {
    int id;
    String name;
    //  Parameterized Constructor
    Person(int id, String  name){
        this.id=id;
        this.name=name;
        System.out.println("Person's constructor called");
    }
}
class Employee extends Person{
    float salary;
    // Constructor
    Employee(int id, String name, float salary){
        // Must be the first statement: to call parent's parameterized constructor
        super(id,name);// It executes the constructor(here, Person) in the parent class that accepts two arguments
        // matching the type of id and name( an int and String)
        this.salary=salary;
        System.out.println("Employee constructor called");
    }
    void display(){
        System.out.println("ID="+id+", Name="+name+", Salary="+salary);
    }
}