package Core_Concepts;

public class Recursion {
    static int sumOfNatNo(int n) {
        int sum = 0;
        if (n > 0) {
            sum += n;
            return sumOfNatNo(n - 1);
        } else {
            return 0;
        }
    }
    static int factorial(int n){   // factorial using recursion
        if(n==0 || n==1){  // base condition
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static void pattern(int n) {        // pattern
        if (n > 0) {
            pattern(n - 1); // start=5 , then 4,3,2,1. NOT 0. Then printing the last called function output or printing reversely; 1,2,3,4,5
            // so recursion of n-- type function  calling will execute the code in normal order but give the output in reverse order
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static float cToF(float C){  // Converting Celsius to Fahrenheit
        return (C*1.8f)+32;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNatNo(50));
        System.out.println(factorial(5));
        pattern(5);
        System.out.println(cToF(30) + "F");

    }
}
