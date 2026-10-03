package Two_Pointers;

import java.util.Arrays;

public class _01_Reverse_An_Array {
    public static int[] Reverse_The_Array(int[] arr){
        int n= arr.length;
        int[] rev_arr=new int[n];
        if( n== 0 || n==1) return arr;
        int start=0,end=n-1;
        while(start<=end){
            rev_arr[start]=arr[end];
            rev_arr[end]=arr[start];
            start++;
            end--;
        }
        return rev_arr;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(Reverse_The_Array(arr1)));
    }
}
