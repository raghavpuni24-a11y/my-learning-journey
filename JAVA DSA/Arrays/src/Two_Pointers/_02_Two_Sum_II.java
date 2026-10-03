package Two_Pointers;

import java.util.Arrays;

public class _02_Two_Sum_II { // input array is sorted -  O(n)

    public static int[] Sorted_Two_Sum(int[] arr, int target){
        int start=0, end=arr.length-1;
        while(start<end){  // can't use the same element twice for start==end
            int sum=arr[start]+arr[end];
            if(sum==target) return new int[]{start, end};
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr1={1,2,6,8,12,23,34};
        int target= 26;
        System.out.println(Arrays.toString(Sorted_Two_Sum(arr1, target)));

    }
}
