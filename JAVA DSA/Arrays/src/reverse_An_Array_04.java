import java.util.Arrays;

// For Space C: O(1)  --- variables take constant space    and TC : O(n)
public class reverse_An_Array_04 {
    public static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]= arr[start];
            arr[start]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int[] arr={12,45,90,46,34,80,67};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); //  Since array is passed  by reference
    }
}
