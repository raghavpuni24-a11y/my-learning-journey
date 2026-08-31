// MAXSUM AND MINSUM FOR CONTINUOUS SUBARRAY
public class maxSubArray_PrefixSum_08 {                // USING PREFIX SUM ARRAY -- TC - O(n2)
    public static void sumSubArrays(int[] arr){
        int currSum=0;
        int minSum=Integer.MAX_VALUE, maxSum=Integer.MIN_VALUE;

        // PREFIX PART
        int[] prefix = new int[arr.length];    // defining prefix array- summed array for reference
        prefix[0]=arr[0];                   // 1st element
        for (int i = 1; i < arr.length; i++) {         // calc prefix array , as sum of from 0th element to the
            prefix[i] = prefix[i-1] + arr[i];                                            // indexed end --- refer notes
        
        }
        
        // COMPARISON PART
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;

                currSum = (start == 0) ? prefix[end] : prefix[end]-prefix[start-1]; // SUM[ 0 to end] - SUM[ 0 to start-1 ]

                // EX : Case : start=1, end=3 (subarray: -2, 6, -1)
                // start≠0, so currSum = prefix[3] - prefix[0] = 4 - 1 = 3
                //  Check manually: -2 + 6 + (-1) = 3 ✔️

                if(maxSum < currSum) maxSum=currSum;
                if(minSum > currSum) minSum = currSum;
                
            }
        }
        System.out.println("Max Sum : "+maxSum);
        System.out.println("Min Sum : "+minSum);
        System.out.println("--------------------------");

    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        sumSubArrays(arr);       // Prefix Arr : [ 2 , 6 , 12 , 20 , 30 ]
        int[] arr1={1,-2,6,-1,3};
        sumSubArrays(arr1);         // PA : [ 1 , -1 , 5 , 4 , 7 ]
    }
}


