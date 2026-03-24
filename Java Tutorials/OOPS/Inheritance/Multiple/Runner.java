package OOPS.Inheritance.Multiple;

public interface Runner {
    void Run();
    default void sprint(){ // In interface to define a method ; you must define it with 'default' keyword.
                          // we can make multiple methods using default keyword in a single interface
        System.out.println("Sprinting fast");
    }

}
