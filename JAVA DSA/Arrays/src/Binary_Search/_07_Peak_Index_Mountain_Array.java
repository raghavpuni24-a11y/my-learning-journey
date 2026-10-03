package Binary_Search;

//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.

public class _07_Peak_Index_Mountain_Array {

    public static int Peak_Index(int[] arr){
        int peak=Integer.MIN_VALUE, index=0;
        int start=0 , end=arr.length-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if (arr[mid]<arr[mid+1] ) {
                peak=arr[mid+1];
                start=mid+1;
                index=mid+1;
            }
            else{
                peak=arr[mid];
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr_1 = {0,1,0};
        int[] arr_2 = {0,2,1,0};
        int[] arr_3 = {0,10,5,2};
        int[] arr_4 = {3,4,5,1};
        int[] arr_5 = {24,69,100,99,79,78,67,36,26,19};
        int[] arr_6 = {0,1,2,3,4,5,4,3,2,1,0};
        int[] arr_7 = {1,2,3,4,5,4,3,2,1};
        int[] arr_8 = {1,3,5,7,9,8,6,4,2};
        int[] arr_9 = {0,5,10,15,20,19,18};

        int[][] testArrays = {arr_1, arr_2, arr_3, arr_4, arr_5, arr_6, arr_7, arr_8, arr_9};

        for (int i = 0; i < testArrays.length; i++) {
            int index =  Peak_Index(testArrays[i]);
            System.out.printf("Peak value of arr%d is at index : %d \n",i+1,index);
        }
    }
}
