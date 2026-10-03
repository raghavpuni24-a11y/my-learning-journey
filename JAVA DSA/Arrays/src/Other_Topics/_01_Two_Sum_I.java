package Other_Topics;

import java.util.Arrays;

public class _01_Two_Sum_I {   // input array is unsorted

    public static int[] Two_Sum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr1={36,3,6,5,7,1,9,34};
        int target=37;
        System.out.println(Arrays.toString(Two_Sum(arr1,target)));

    }
}
