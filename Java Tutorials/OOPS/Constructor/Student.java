package OOPS.Constructor;

public class Student {
    // Data members or Instance variables
    int stdID;
    String name;
    String city;

    // data methods or member functions

    public void study(){
        System.out.println( name +" is studying");
        System.out.println();
    }
    public void showFullDetails(){
        System.out.println("My name is " +name);
        System.out.println("My student ID is "+stdID );
        System.out.println("I live in "+city);
        System.out.println();
    }
    // Creating constructors
    public Student(){
        System.out.println("Non-parametrized constructor");
        System.out.println();
    }
    //Constructor Overloading
    public Student(int a){
        System.out.println("parametrized constructor");
        System.out.println();
    }

}

