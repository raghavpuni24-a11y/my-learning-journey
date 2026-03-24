package OOPS.Object;

class Human{
    private int age=10;
    public String name;
    public int getAge(){
        return age;
    }
    public void getName(){
        System.out.println(name);
    }
}
public class Objects{
    public static void main(String[] args) {
        Human h=new Human();
        System.out.println(h.getAge());
        Human ab; // Only declaration but not initialized so will throw error, to initialize the object
        Human bc =new Human();
//        ab.name="Raghav";
    }
}
