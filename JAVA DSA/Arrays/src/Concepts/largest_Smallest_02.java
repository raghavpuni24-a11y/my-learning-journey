public class largest_Smallest_02 {
    public static int getLargestAndSmallestNumber(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max) {
                 max=arr[i];
             }
             if (arr[i]<min) {
                 min=arr[i];
             }
        }
        System.out.println("Smallest Value is : "+min);
        return max;
    }
    public static void main(String[] args) {
         int[] arr={12,45,90,46,34,80,67};
        System.out.println("Largest value is : "+getLargestAndSmallestNumber(arr));

    }
}
