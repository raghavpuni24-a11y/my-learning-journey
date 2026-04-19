package Exceptional_Handling;

public class multipleTryAndCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        String s = null;
         // to trigger multiple exceptions at once
        // try block 1 — risky math
        try {
            int r = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("❌ Math error: " + e.getMessage());
        }
        finally{
            System.out.println("finally after the ArithmeticException ");
        }
        // try block 2 — risky array access
        try {
            int x = arr[5];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array error: " + e.getMessage());
        }

        // try block 3 — risky null access
        try {
            s.length();
        }
        catch (NullPointerException e) {
            System.out.println("❌ Null error: " + e.getMessage());
        }

        System.out.println("✅ Program continues normally");
    }
}
