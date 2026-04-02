package OOPS.Interfaces;
 @FunctionalInterface    // Annotation for Functional Interface
interface A{
           void show();
}
@FunctionalInterface    // Annotation for Functional Interface
interface B{
    void greet();
}
@FunctionalInterface
interface C{
     void name(String name);
}
@FunctionalInterface
interface D{
     void sum(int a,int b);
}
@FunctionalInterface
interface E{
     int sum(int a,int b);
}
public class functional_Interface {
    public static void main(String[] args) {
      //  A obj=new A(); // this is not possible for an interface
        A obj1 = new A(){        // Anonymous Inner Class
            public void show(){
                System.out.println("In show.");
            }
        };
        obj1.show();

// LAMBDA EXPRESSIONS
        A obj2 = () -> System.out.println(" by using Lambda expression.");  // without brackets if there is only one
        // statement
        obj2.show();
        B obj3 =()-> {         // multiple statements
            System.out.println("hello");
            System.out.println("Hey, it's a nice day to sail the boat!");
        }   ;
        obj3.greet();
    // one parameter- bracket optional
        C obj4 = name-> System.out.println(name);
        obj4.name("Raghav");
        C obj5 =(name)-> System.out.println("name of obj5: "+name);
        obj5.name("Raghav");
    // Multiple parameters
        D obj6= (a,b)-> System.out.println(a+b);
        // Shorthand for multiple parameters
        D obj7 = (a,b)->  a+b ;
    // full form- multi-line
        E obj8= (a,b) -> {
            int result= a+b;
            return result;
        } ;
        
    }
}
