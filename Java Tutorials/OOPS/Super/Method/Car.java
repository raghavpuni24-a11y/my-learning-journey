package OOPS.Super.Method;

public class Car extends Vehicle {
    void speed(){
        // calling the parents class run method
        super.run();
        // Car's specific implementation
        System.out.println(" Car is running safely");
    }

}
