public class subArrays_06 {  // SUBARRAY - CONTINUOUS SECTION OF AN ARRAY
    public static void printSubArrays(int[] arr){   // total subarrays : n(n+1)/2
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {      
            for (int j = i; j < arr.length; j++) {
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")");
                totalSubArrays++;
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+ totalSubArrays);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        printSubArrays(arr);
    }
}
