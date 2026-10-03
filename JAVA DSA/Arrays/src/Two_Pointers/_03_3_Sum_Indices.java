package Two_Pointers;

import java.util.Arrays;
import java.util.Comparator;
// returning only the index of the first triplet match found
public class _03_3_Sum_Indices {
    public static int[] _3_Sum(int[] arr, int target){
        int n=arr.length;
        int[][] pairs=new int[n][2];  // n rows for n pairs of arr values with their org index
                                      // 2 columns - 1st for value and 2nd for org index
        // fit the value and index into pairs
        for (int i = 0; i < n; i++) {
             pairs[i][0] = arr[i];     // arr elements or values - 1st col
             pairs[i][1] = i;          // org index of every value  - 2nd col
        }

        Arrays.sort(pairs, Comparator.comparingInt(x -> x[0]));
        // Sort 'pairs' by column 0 (the value), while keeping each value's
        // original index (column 1) attached to it.
        // Arrays.sort() does the actual sorting (loops + swaps internally).
//        x = a parameter representing one row of pairs (i.e., one {value, index} pair)
//        x[0] = extracts just the value part of that row (column index 0)
//        Comparator.comparingInt(x -> x[0]) builds a comparator that says: "for sorting purposes, use x[0] (the value) as the thing to compare rows by"
//        Arrays.sort(pairs, thatComparator) then sorts all rows of pairs, ordering them based on comparing their [0] values — while each row's [1] (original index) travels along with it, unchanged



        for (int i = 0; i < arr.length; i++) {
            int a=pairs[i][0];
            int start=i+1,end=arr.length-1;
            while(start<end){
//                if(start==i || end==i) continue;         -- never hits
                int sum= a + pairs[start][0] + pairs[end][0];
                if(sum==target) return new int[]{pairs[i][1], pairs[start][1], pairs[end][1]};
                else if (sum<target) start++;
                else end--;
            }
        }
        return new int[]{-1,-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target=0;
        System.out.println(Arrays.toString(_3_Sum(nums,target)));
    }
}
