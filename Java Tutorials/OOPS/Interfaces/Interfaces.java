package OOPS.Interfaces;

interface Human{   // IF  1
    int legs=2;// Instance variables are by default public and abstract in interfaces, must initialize them
    String area="Bhopal";

    void work(); // methods are public abstract - in IF
    void eat();

    default void sleep(){    // default method - optional override , will be inherited for free
        System.out.println("Human sleeps 8 hrs");
    }
}
interface Coder{       // IF 2
    void code();
    void debug();
    default void drink(){
        System.out.println("Drinks coffee while coding");
    }
}
interface Learner{         // IF 3
    void learn();
}
class Teacher implements Human{
    String name;
    Teacher(String name){
        this.name=name;
    }
    public void work(){
        System.out.println(name+" teaches Java.");
    }
    public void eat() {
        System.out.println(name + " is eating in the staff room.");
    }
}
class Student implements Human,Coder,Learner{
    String name;
    String branch;
    Student(String name,String branch){
        this.name=name;
        this.branch=branch;
    }
    @Override
    public void work() {
        System.out.println(name+" is studying "+branch);
    }
    @Override
    public void eat() {
        System.out.println(name+" is eating in the canteen.");
    }
    @Override
    public void code() {
        System.out.println(name+" is coding in Java");
    }
    @Override
    public void debug() {
        System.out.println(name+" is debugging errors");
    }
    @Override
    public void learn() {
        System.out.println(name+" is Learning Interfaces");
    }
    @Override
    public void sleep(){   // default method - optional to override, here overriding it
        System.out.println(name+" sleeps only 6hrs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        System.out.println("BASIC USAGES:");
        Student st =new Student("Raghav","AI&DS");
        Teacher tc=new Teacher("Dr. Kumar");
        st.work();
        st.code();
        st.learn();
        st.sleep();    // overridden version!
        st.drink();    // overridden version!

        tc.work();
        tc.sleep();    // default version from Human!

       // Human.legs=4;  ERROR b/c legs variable is final and can't be reassigned

        
    }
}
