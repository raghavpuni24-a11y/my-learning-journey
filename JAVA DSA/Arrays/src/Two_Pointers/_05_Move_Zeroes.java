package Two_Pointers;

import java.util.Arrays;

public class _05_Move_Zeroes {
    public static int[] Move_Zeroes(int[] arr){
        int count_zero=0;
        int insert_pos=0;    // the pos pointer where the non-zero element need to be placed
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                count_zero++;    // just counts the no. of zeroes
            }
            else{
                arr[insert_pos]=arr[i]; // place the non-zero element here and move the insert_pos pointer by +1
                insert_pos++;
            }
        }  // { 1,3,12,3,12] / ip = 3
        while(count_zero>0){       // now place the zeroes after the non-zero elements
            arr[insert_pos]=0;
            count_zero--;
            insert_pos++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        System.out.println(Arrays.toString(Move_Zeroes(arr)));
        int[] arr1={0};
        System.out.println(Arrays.toString(Move_Zeroes(arr1)));
    }
}
