import java.util.Arrays;

public class printMaxSubArray_Kadanes_10 {

    private static void sumSubArrays(int[] arr) {
        int currSum=0 , maxSum = Integer.MIN_VALUE;
        int start = 0 , end = 0 , tempStart = 0;

        for (int i = 0; i < arr.length; i++) {

            currSum+=arr[i];

            if(currSum>maxSum){
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if(currSum<0){
                currSum=0;          // for negative values -- reset
                tempStart = i+1;    // reset the tempStart value to the next upcoming index when the currsum < 0 , where the segment actually restarts...
            }
        }
        System.out.println("Max Sum : "+maxSum);
        System.out.println("Max Sum SubArray : "+ Arrays.toString(Arrays.copyOfRange(arr,start,end+1)));    // — note the end+1, since copyOfRange excludes the upper bound, and you want end itself included.
    }

    public static void main(String[] args) {
        int[] arr1={-2, -3, 4, -1, -2, 1, 5, -3};
        sumSubArrays(arr1);
        int[] arr2 = {-8,-6,-4,-2,-9};  // FOR ALL NEGATIVE ELEMENTS
        sumSubArrays(arr2);

    }


}
