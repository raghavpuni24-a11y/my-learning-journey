package Ques;
                                     
import java.util.Scanner;
public class armstrongNo {
    // 153 = 1^3 + 5^3 + 3^3
    public static void main(String[] args) {
        System.out.print("Enter a no.: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
// Displaying all 3 digit armstrong NO.
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i)){
                System.out.print( i +" ;");
            }
        }

    }
    private static boolean isArmstrong(int n) {
        int org=n;
        int sum=0;
        while(org>0){
            int r = org%10;            //    3     5     1
            sum = sum+(r*r*r);       //    27   152    153
            org=org/10;               //   15    1     0
        }
        // here now org becomes 0, so use n instead
        return sum==n ;

        
    }
}
