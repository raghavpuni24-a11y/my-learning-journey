package Exceptional_Handling;

public class tryCatch {
    public static void main(String[] args) {
    // EXCEPTION OCCURS
        System.out.println("Program starts: ");
        try{  // try is the risk zone and you put here that part of code which can produce exceptions
            System.out.println("In try: before crash->");
            int a=10/0;         // Arithmetic exception            --- once the exception line hits inside try, remaining lines in try are skipped and control goes to catch.
            System.out.println("try :after crash");  // never run
        }
//        System.out.println("hey this is the code after the try block ");
        catch(ArithmeticException e){
            System.out.println("catch: caught it!-> "+ e.getMessage());       // / by zero
            System.out.println("catch: caught it!-> "+ e.toString()); // java.lang.ArithmeticException: / by zero
            System.out.println("catch: caught it!-> ");
            e.printStackTrace();// can't be concatenated, runs at the END of the code execution - giving a red colour
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
