import java.util.Arrays;

public class maxSubArray_Kadanes_09 {

    public static void sumSubArrays(int[] arr){
        int currSum=0, maxSum=Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {

           currSum += arr[i] ;

           if(currSum>maxSum){       // MaxSum comparison before resetting the currSum to 0 for 'every element is
               maxSum=currSum;       // negative ' case
           }

           if(currSum<0){
               currSum=0;          // resetting the currsum ,as the negative sum will only take down the sum ,and we
                                  // have already covered the majority negative element part above
           }

        }
        System.out.println(maxSum);
    }
    
    public static void main(String[] args) {
        int[] arr1={-2, -3, 4, -1, -2, 1, 5, -3};
        sumSubArrays(arr1);
        int[] arr2 = {-8,-6,-4,-2,-9};  // FOR ALL NEGATIVE ELEMENTS
        sumSubArrays(arr2);

    }
}
