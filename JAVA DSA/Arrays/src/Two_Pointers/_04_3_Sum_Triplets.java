package Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
// returning all the possible matching condition triplets
public class _04_3_Sum_Triplets {

    public static ArrayList<ArrayList<Integer>> _3_Sum(int[] arr, int target){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);     // enable  duplicates check and 2 pointer movement
        int n=arr.length;
        for (int i = 0; i < n-2; i++) {       // Outer loop - the ith index value will be fixed (the 1st value) and the
            // other 2 pointer will move and search for the required sum condition
            if(i > 0 && arr[i] == arr[i-1])  continue;   // if arr[i] == arr[i-1], we will be having exact same
            // triplet again(if it exists) or the search will be done for the same ith value
            int a=arr[i];     // 1st pointer - fixed value - increments linearly
            int start=i+1, end=n-1;    // other 2 pointers

            while (start < end) {

                int sum = a + arr[start] + arr[end];
                if (sum == target) {
                    ArrayList<Integer> temp=new ArrayList<>(3);
                    temp.add(arr[i]);
                    temp.add(arr[start]);
                    temp.add(arr[end]);
                    result.add(temp);
                    // duplicate-skip only makes sense AFTER a match — checking just after outer while loop
                    // (unconditionally, pre-sum-check) would wrongly reject untried valid pairs
                    // (e.g. arr[start]==arr[start-1] doesn't mean bad pair,
                    // it's only bad once arr[start-1] was already used in a recorded triplet)
                    start++;
                    end--;
                    while (start < end && arr[start] == arr[start - 1]) start++;   // skip dupes only after using this value
                    while (start < end && arr[end] == arr[end + 1]) end--;         // same reasoning for end
                }
                else if (sum < target) start++;
                else end--;
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target=0;
        System.out.println((_3_Sum(nums,target)));
    }
}
