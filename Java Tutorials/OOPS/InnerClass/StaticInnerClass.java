package OOPS.InnerClass;

class College1{
    String name="RGPV";
    static String location="Bhopal";
    static int established =1999;
     void display1(){
         System.out.println("display");
     }
//  STATIC INNER CLASS
     static class Address{
         void display(){
             //System.out.println(name); ERROR b/c only static members can be accessed by static method
             System.out.println("Location: "+location);
             System.out.println("Established: "+established);
         }
     }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        College1.Address addr=new College1.Address();// no need to call static class Address through object of 
        // College1 class b/c it is static, unlike regular inner class
        addr.display();
        College1 c1=new College1();
//        c1.display();   not possible b/c College1 is just a container to store class Address , not its parent
    }
}
