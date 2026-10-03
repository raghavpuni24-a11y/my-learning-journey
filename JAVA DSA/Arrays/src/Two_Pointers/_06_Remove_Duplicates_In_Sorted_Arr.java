package Two_Pointers;

import java.util.Arrays;

public class _06_Remove_Duplicates_In_Sorted_Arr {
    public static int[] Remove_Dupl(int[] arr){
        int insert_pos=1;
        for (int i = 1; i < arr.length; i++) {
             if(arr[i]!=arr[i-1]) {
                 arr[insert_pos] = arr[i];
                 insert_pos++;
             }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3,4,4,5};
        System.out.println(Arrays.toString(Remove_Dupl(arr)));
        int[] arr1={1,1,1,1};
        System.out.println(Arrays.toString(Remove_Dupl(arr1)));
        int[] arr2={1,2,3};
        System.out.println(Arrays.toString(Remove_Dupl(arr2)));
    }
}
