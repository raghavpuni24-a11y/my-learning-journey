package Core_Concepts;

public class staticVariable {
    public static void main(String[] args) {
                      Mobile m1=new Mobile();
                      m1.name="Smartphone"  ;
                      m1.price=1500;
                      m1.brand= "Samsung";
                      Mobile m2=new Mobile();
                      m2.name="Smartphone";
                      m2.price=1600;
                      m2.brand= "Apple";
                      m1.name="Phone";// name is also changed for m2 because static variable changes the data for all the other objects ,ie., static v will share the same information among all the other objects which uses it.
        // static v must be accessed via a static member(here by the class name not by an instance member
        //     SO]   Mobile.name="Phone";  is the right way to do this
                      Mobile.name="Phone"; // is the right way
                      m1.show();
                      m2.show();
    }
}
class Mobile{
       static String name;     // static variable
       int price;             // instance variable
       String brand;         // instance variable
       void show(){
           System.out.println(brand+" - "+price+" - "+name);
       }
}


