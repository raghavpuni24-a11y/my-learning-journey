package Ques;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }

    private static boolean prime(int n) {
        int c=2;
        if(n<=1)
            return false;
        while(c*c<=n){
            if (n%c==0)
                return false;
            c++;
        }
     return c*c<n;  // false or true
    }
}
