package Binary_Search;
// Given a sorted array and a target, return the index if found. If not found, return the index where it would be inserted to keep the array sorted.

import java.util.Scanner;

public class _10_Insert_Position_Sorted_Array {

    public static int Insert_Target_Sorted_Array(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target){  // target exists in right side
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return  Math.max(start,0);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 = {1, 3, 5, 6};      // target = 5  -> expected: 2 (found in middle)
        int[] arr2 = {1, 3, 5, 6};      // target = 2  -> expected: 1 (would insert in middle)
        int[] arr3 = {1, 3, 5, 6};      // target = 7  -> expected: 4 (would insert at end)
        int[] arr4 = {1, 3, 5, 6};      // target = 0  -> expected: 0 (would insert at start)
        int[] arr5 = {1};               // target = 1  -> expected: 0 (single element, matches)
        int[] arr6 = {5};               // target = 2  -> expected: 0 (single element, target smaller)
        int[] arr7= {5};               // target = 10 -> expected: 1 (single element, target larger)
        int[] arr8 = {1, 3, 3, 3, 5};   // target = 3  -> expected: any valid index of a 3
        int[] arr9 = {};                // target = 5  -> expected: 0 (empty array)

        int[][] testArrays = {arr1, arr2, arr3, arr4, arr5,arr6,arr7,arr8,arr9};
        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the target for arr%d : ",i+1);
            int t = sc.nextInt();
            int index = Insert_Target_Sorted_Array(testArrays[i], t);
            System.out.println(index);
        }
    }
}
