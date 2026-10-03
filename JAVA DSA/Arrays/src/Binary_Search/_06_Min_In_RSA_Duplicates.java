package Binary_Search;

import java.util.Scanner;

// Search Min in Rotated Sorted Array II (with duplicates)   -- same logic as _04_Min_In_RSA
public class _06_Min_In_RSA_Duplicates {

    public static int Min_RSA_Duplicates_Search(int[] nums) {
        int min = Integer.MAX_VALUE;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < min) min = nums[mid];
            if (nums[start] == nums[mid] && nums[mid] == nums[end] && nums[start] == nums[end]) {       // better to
                // practice with this, for the worst case scenario
                min=Math.min(Math.min(nums[start],nums[mid]),min);
                min=Math.min(nums[end],min);
                start++;
                end--;
            }
            else{
                if (nums[mid] > nums[end] ) { // pivot exists -- checking for min in right part - part after arr[mid]
                    min=Math.min(nums[start],min);   // checking the extreme left element for min
                    start=mid+1;
                }
                else{
                    min=Math.min(nums[end],min);
                    end=mid-1;
                }
            }
        }
        if(min==Integer.MAX_VALUE ) return -1;
        else return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};       // no duplicates, standard rotation → min = 0
        int[] arr2 = {2, 5, 6, 0, 0, 1, 2};       // classic LC dup example → min = 0
        int[] arr3 = {1, 0, 1, 1, 1};             // low==mid==high collision → min = 0
        int[] arr4 = {1, 1, 1, 1, 1, 2, 1};       // worst-case O(n) trigger → min = 1
        int[] arr5 = {1, 1, 1, 1, 1, 1, 1};       // all same, no true rotation → min = 1
        int[] arr6 = {3, 1, 2, 3, 3, 3, 3};       // min buried early, dupes after → min = 1
        int[] arr7 = {5, 1, 3};                   // small, odd length, no dupes → min = 1
        int[] arr8 = {1};                         // single element → min = 1
        int[] arr9 = {1, 3};                      // two elements, rotated trivially → min = 1
        int[] arr10 = {3, 1};                     // two elements, min at end → min = 1
        int[] arr11 = {1, 1, 1, 3, 1};            // naive-jump-breaks case → min = 1
        int[] arr12 = {2, 2, 2, 3, 4, 2};         // ambiguous but resolvable → min = 2
        int[] arr13 = {1, 2, 3, 4, 5};            // not rotated at all → min = 1
        int[] arr14 = {4, 4, 4, 4, 4};            // fully flat array → min = 4
        int[] arr15 = {};                      // empty — 154 assumes non-empty per LC constraints, skip or handle separately

        int[][] testArrays = {arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10, arr11, arr12, arr13, arr14, arr15};

        for (int i = 0; i < testArrays.length; i++) {
            int min =  Min_RSA_Duplicates_Search(testArrays[i]);
            if(min!=-1)  System.out.printf("Min element in arr%d is : %d \n",i+1 ,min);
            else System.out.println("Empty Array !");
        }
    }
}
