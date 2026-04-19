package Exceptional_Handling;

import java.util.Scanner;

public class Throw {
    static void checkAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18+. Your age is : "+ age) ; // arguments as new is the
            // obj and the Exception type is actually a constructor --, IllegalArgumentException - a subclass of
            // Throwable , the exception must be a subclass of throwable class
        }
        else{
            System.out.println("Enjoy the party!!");
        }
        System.out.println("Statement after throw ");  // will not run once the throw is executed
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)  ;
        System.out.println("Enter ur age: ");
        int age=sc.nextInt();
        try{
            checkAge(age);  // will throw
        }
        catch(IllegalArgumentException e){
            System.out.println("Caught: "+e.getMessage());
        }
    }
}

