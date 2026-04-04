package Exceptional_Handling;

public class Throw {
    static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException(("Age must be 18+. You enetered : "+ age)) ; // arguments as new is the obj and the Exception type is actually a constructor
        }
        System.out.println("Statement after throw ");  // will not run once the throw is executed
    }
    public static void main(String[] args) {
        try{
            checkAge(15);  // will throw
        }
        catch(IllegalArgumentException e){
            System.out.println("Caught: "+e.getMessage());
        }

    }
}
