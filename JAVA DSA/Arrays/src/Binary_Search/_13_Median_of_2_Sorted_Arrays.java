package Binary_Search;

public class _13_Median_of_2_Sorted_Arrays {
    public static double find_Median(int[] arr1, int[] arr2){
        if(arr1.length > arr2.length){
            return find_Median(arr2, arr1); // swap arrays
        }
        int m=arr1.length, n= arr2.length;
        int start=0, end=m;
        return 0;
    }
    public static void main(String[] args) {

    }
}
