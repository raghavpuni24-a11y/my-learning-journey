package Exceptional_Handling;

public class multipleCatch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
         try{
             int r=10/0;                 //     ArithmeticException
        //      int x = arr[5];                //  → ArrayIndexOutOfBoundsException
         //     String s = null; s.length();    //→ NullPointerException
         }
         // The first exception will only be taken out by the catch block, others will be ignored and the
         // compiler will jump to the code written right after every catch block- one catch block will be executed in 1
         // run
         catch (ArithmeticException e){
             System.out.println("Arithmetic error: "+e.getMessage());
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Array went out of bounds: "+ e.getMessage());
         }
         catch (NullPointerException e){
             System.out.println("Null pointer hit: "+ e.getMessage());
         }
         catch (Exception e){ // Exception class is the parent of all the exceptional classes
             System.out.println("Some other error: "+ e);
         }
         finally{
             System.out.println("The finally pgm");
         }
        System.out.println("Pgm continues normally- after execution of an exception ");
        System.out.println(10+20);
    }
}
