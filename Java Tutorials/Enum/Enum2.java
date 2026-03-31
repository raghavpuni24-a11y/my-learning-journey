package Enum;

enum Branch{
    AI("Artificial Intelligence", 60),
    CS("Computer Science", 120),
    IT("Information Technology", 60),
    MECHANICAL("Mechanical Engineering", 90);// will throw error until u define the fields in the enum-  in the constructor or method
    // fields
    String name;
    int seats;
    // constructor
    Branch(String name,int seats) {
        this.name=name;
        this.seats=seats;
    }
    //method
//    void
}
public class Enum2 {
}
