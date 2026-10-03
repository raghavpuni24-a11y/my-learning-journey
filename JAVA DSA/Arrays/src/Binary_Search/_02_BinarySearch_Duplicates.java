package Binary_Search;

// Find the first and last occurrence of a target in a sorted array that may contain duplicates.

import java.util.Arrays;
import java.util.Scanner;

public class _02_BinarySearch_Duplicates {

    public static int[] findFirstAndLast(int[] arr, int key){
        int first=findFirst(arr,key), last=findLast(arr,key);
        int[] occ=new int[2];// first and last occurrences
        occ[0]=first;
        occ[1] = last;
        if(first!=-1){
            return occ;
        }
        return new int[]{-1,-1};
    }
                        
    public static int findFirst(int[] arr, int key){     // Focusing on the LEFT SIDE for the 1ST occurrence
        int first=-1, start=0, end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)  / 2;    // ALWAYS USE THIS MID FORMULA
            if(arr[mid]==key){
                first=mid;   // save this as a candidate answer
                end=mid-1;   // keep searching the LEFT side for the 1st occurrence
            } else if(arr[mid] < key ) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }

    public static int findLast(int[] arr, int key){     // Focusing on the RIGHT SIDE for the LAST occurrence
        int last=0, start=0, end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)  / 2;
            if(arr[mid]==key){
                last=mid;   // save this as a candidate answer
                start=mid+1;   // keep searching the RIGHT side for the 1st occurrence
            } else if(arr[mid] < key ) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 7, 7, 8, 8, 10};
        int[] arr2 = {5, 7, 7, 8, 8, 10};
        int[] arr3 = {};
        int[] arr4 = {1};
        int[] arr5 = {1};
        int[] arr6 = {2, 2, 2, 2, 2};
        int[] arr7 = {1, 1, 2, 3, 4};
        int[] arr8 = {1, 2, 3, 4, 4};

        int[][] testArrays = { arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8};
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the target for arr%d : ",i+1);
            int key = sc.nextInt();
            int[] index = findFirstAndLast(testArrays[i], key);
            if(index[0]!=-1) System.out.println(Arrays.toString(index));
            else System.out.println("Not Found!!");
        }
    }
}

