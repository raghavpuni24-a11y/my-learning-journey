package Exceptional_Handling;

public class tryCatch {
    public static void main(String[] args) {
    // EXCEPTION OCCURS
        System.out.println("Program starts: ");
        try{
            System.out.println("In try: before crash->");
            int a=10/0;         // Arithmetic exception
            System.out.println("try :after crash");  // never run
        }
        catch(ArithmeticException e){
            System.out.println("catch: caught it!-> "+ e.getMessage());
            System.out.println("catch: caught it!-> "+ e.toString());
            System.out.println("catch: caught it!-> ");
            e.printStackTrace();// can't be concatenated, runs at the last of the code - giving a red colour
            // exception like an error
        }
        finally{ // always runs
            System.out.println("Finally: always runs!");
        }
        System.out.println("----");
    //NO EXCEPTION
        try{
            System.out.println("safe code: 10/2: "+ (10/2));
        }
        catch (ArithmeticException e){
            System.out.println("catch : this won't run!");
        }
        finally{
            System.out.println("Finally : still runs!");
        }
        System.out.println("Program ends : not crashed! ");
    }
}
