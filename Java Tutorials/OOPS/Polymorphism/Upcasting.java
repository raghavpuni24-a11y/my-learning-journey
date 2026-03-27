package OOPS.Polymorphism;

abstract class Human{
    String name;
    abstract void work();
    void eat(){
        System.out.println(name+" is eating.");
    }
}
class Student extends Human{
       Student(String name){
           this.name=name;
       }
       void work(){
           System.out.println(name +" is studying Java.");
       }
}
class Teacher extends Human{
    Teacher(String name){
        this.name=name;
    }
    void work() {
        System.out.println(name+" is teaching Java.");
    }
}
class Director extends Human{
    Director(String name){
        this.name=name;
    }
    void work() {
        System.out.println(name+" is managing RGPV");
    }
}
// Adding a new class
class Peon extends Human{
    Peon(String name){
        this.name=name;
    }
    void work(){
        System.out.println(name +" is cleaning the college");
    }
}
public class Upcasting {
    public static void main(String[] args) {
    // Upcasting
        Human h1=new Student("Raghav");   // Upcasting- the real object is of class Student but reference of class Human is passed
        Human h2=new Teacher("Dr. Rishu");
        Human h3=new Director("Dr. Sharma");
    // Printing same function
        h1.work();
        h2.work();
        h3.work();
    // Accessing eat method
        h1.eat();
        h2.eat();
        h3.eat();
    // Store in array and loop
        Human[] college={h1,h2,h3};
        for (Human h:college){
            h.work();
        }
    // Peon section
        Human h4=new Peon("Vinu");
        h4.eat();
        h4.work();
        college[3]=h4;
        
    }
}
