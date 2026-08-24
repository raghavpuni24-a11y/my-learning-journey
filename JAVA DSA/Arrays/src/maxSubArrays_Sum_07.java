public class maxSubArrays_Sum_07 {
    public static void sumSubArrays(int[] arr){   // total subarrays : n(n+1)/2
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum=0;
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print(") = "+sum+" | ");
                if(sum<min){
                    min=sum;
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum = "+max);
        System.out.println("Min Sum = "+min);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        sumSubArrays(arr);
        int[] arr1={1,-2,6,-1,3};
        sumSubArrays(arr1);
    }
}
