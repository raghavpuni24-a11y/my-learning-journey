package OOPS.Super.instanceVar;

public class Dog extends Animal{
    String color="black";
    void display(){
        System.out.println("Dogs color is: "+ color);
        System.out.println("Animal's color is: "+ super.color);// accessing immediate parent class's instance variable
    }
}
