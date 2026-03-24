package Array.multiDArrays;

import java.util.Arrays;
import java.util.Scanner;
class Student{
    int n=10;
}
public class Inp_Output {
    public static void main(String[] args) {
//        Taking this as an input and then displaying it , case of an irregular array size
//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8,9} // 2nd index-> arr[2]={6,7,8,9}
        Scanner sc=new Scanner(System.in);
        System.out.print("Specify the no. of rows and columns respectively: ");
        int r=sc.nextInt(),c=sc.nextInt() ;
        System.out.format("Your array is arr[%d][%d]",r,c).println();
        int[][] arr=new int[r][c];
        System.out.println("Give the elements of the array: ");
    // INPUT
        for (int i=0; i< arr.length;i++){  // for rows
            for(int j=0;j<arr[i].length;j++){     // for columns of the sub-arrays, used when the no.  of columns is
                //not fixed
                System.out.format("arr[%d][%d]=",i,j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
    // OUTPUT
        for (int i=0; i< arr.length;i++){  // for rows
            System.out.println(Arrays.toString(arr[i]));   // displaying the elements as a subarray form
        }     // OR 
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));    // displaying the elements as a subarray form
         }
        // OR displaying as individual elements, not as subarray form
        System.out.println();
        for(int []a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }


    }
}
