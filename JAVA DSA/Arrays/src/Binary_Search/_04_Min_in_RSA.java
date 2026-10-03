package Binary_Search;

import java.util.Scanner;
// Find Minimum in Rotated Sorted Array Same array style  -- BY BINARY SEARCH

public class _04_Min_in_RSA {

    public static int Min_in_RSA(int[] arr){
        int min=Integer.MAX_VALUE;
        int start=0, end= arr.length-1;
        while(start<=end){
            int mid= start + (end-start) / 2;
            if( arr[mid] < min ) min= arr[mid] ;   
            if( arr[mid] > arr[end] ){   // pivot exists -- means min is in the RIGHT sorted part -- initiated for
                // start=0 (1st element) and end=last element, now we will check for elements in the right sorted part
                // (if pivot really exists) and check for the other min element
                // No self-collision anymore — 'mid' and 'end' are guaranteed different indices whenever start != end
                // (since 'mid' ROUNDS DOWN TOWARDS START, end is always ≥ mid+1 unless start==end).
                min = Math.min( arr[start],min ) ; // checking min element from left to right 
                start = mid+1;  // checking the right sorted part  -- avoiding same value collisions by taking mid+1
            }
            else{        // searching in LEFT sorted part -- since left sorted part elements can be smaller than the
                        // end ones ( arr[mid] < arr[end] ) and may be smaller than the mid-ones
                min = Math.min(arr[mid],min); // since arr[mid] < arr[end]
                end=mid-1;    // -- avoiding same value collision by taking mid-1
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TEST CASES
        int[] arr1 = {4,5,6,7,0,1,2};      // standard rotation, mid in high part
        int[] arr2 = {1,2,3,4,5};          // no rotation at all (pivot=0)   --
        int[] arr3 = {2,1};                // 2 elements, rotated
        int[] arr4 = {1,2};                // 2 elements, not rotated
        int[] arr5 = {1};                  // single element
        int[] arr6 = {3,4,5,1,2};          // rotation point in middle-ish    --
        int[] arr7 = {5,1,2,3,4};          // rotation right after index 0  --
        int[] arr8 = {2,3,4,5,1};          // rotation near the end
        int[] arr9 = {1,1,1,1,1};          // all duplicates (edge case, careful!)
        int[] arr10 = {3,1,3};             // duplicates + rotation (tricky for arr[mid] vs arr[end] logic)
        int[] arr11 = {4,5,6,7,7,0,1,2};   // duplicates present but still solvable

        int[][] testArrays={arr1,arr2,arr3,arr4,arr5,arr6,arr7,arr8,arr9,arr10,arr11};

        for (int i = 0; i < testArrays.length; i++) {
            int min =  Min_in_RSA(testArrays[i]);
            System.out.printf("Min element in arr%d is : %d \n",i+1 ,min);
        }

    }
}
