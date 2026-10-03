package Sliding_Window;
// Given an array and a fixed window size k, find the max sum of any k contiguous elements( k=3 here ).

import java.util.Arrays;
import java.util.Scanner;

public class Max_Sum_SubArray {
    public static int Max_SubArr_Sum(int[] arr, int k){
        int windowSum=0;
        for (int i = 0; i < k; i++) {                   // for the 1st max of 1st windowSum set elements
            windowSum+=arr[i];
        }
        int max = windowSum;
        int left=0,right=k;
        while(right<arr.length) {      // since the 1st windowsum set is already covered amd the
            // last permisssible index for 'for' loop is (arr.length - k -1
            windowSum = windowSum - arr[left++] + arr[right++];
            if (windowSum > max) max = windowSum;
        }
        return max;
    }                                                                 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,1,5,1,3,2};
        int k=sc.nextInt();
        System.out.println(Max_SubArr_Sum(arr,k));
    }
}
