package OOPS.InnerClass;

abstract class Human{
    String name;
    abstract  void work();
    void sleep(){
        System.out.println(name + "sleeps.");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // NO separate class - inline definition - ANONYMOUS INNER CLASS
        Human Raghav =new Human(){  // Raghav will act like an object in the main code but is a class
            // Human is an abstract class so its object can't be created ,but here, Raghav is the object of AIC,
            // which doesn't have a name of itself,its anonymous
            void work(){
                System.out.println("Raghav studies Java");
            }
        };
        Human Prince=new Human(){
            void work(){
                System.out.println("Prince studies Python");
            }
        };
        Human Akshu=new Human(){
            void work(){
                System.out.println("Akshu studies WebD");
            }
        };
    // Calling methods
        Raghav.name="Raghav ";
        Prince.name="Prince";
        Akshu.name="Akshu";

        Raghav.work();
        Prince.work();
        Akshu.work();
    }
}
