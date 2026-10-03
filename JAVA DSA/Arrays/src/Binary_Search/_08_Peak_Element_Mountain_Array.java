package Binary_Search;

//Find Peak Element. Nice, this one's closely related to what you just solved, but with a twist: no guaranteed single mountain shape, array can have multiple peaks, and nums[i] != nums[i+1] for adjacent elements. You just need a peak, any peak.

public class _08_Peak_Element_Mountain_Array {

    public static int Peak_Element(int[] arr){
        // THIS IS ALSO VALID BUT CONTAINS EXTRA BOOKKEEPING VARIABLES -- INCREASES COMPLEXITY OF CODE IN NO PROFIT
        // -- ATTEMPT 1

//        int peak=arr[0];
//        int start=0 , end=arr.length-1;
//        while(start < end){
//            int mid= start + (end-start) / 2;
//            if( arr[mid] < arr[mid+1] ){
//                peak=Math.max(peak,arr[mid+1]);
//                start=mid+1;
//            }
//            else {
//                peak=Math.max(peak,arr[mid]);
//                end=mid-1;
//            }
//        }
//        return peak;

        // EASIER VERSION

        int start=0, end=arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;   // <- still your original, eventually start and end squeeze down to a single index, and at last ,start==end and the loop vanishes , giving out the arr[start]==arr[end]==arr[mid] element-- value at convergence
            }
        }
        return arr[start];   // return the value at convergence, not a tracked peak
    }

    public static void main(String[] args) {
        int[] arr_1 = {1,2,3,1};             // 3
        int[] arr_2 = {1,2,1,3,5,6,4};       // 6
        int[] arr_3 = {1};                   // 1
        int[] arr_4 = {1,2};                 // 2
        int[] arr_5 = {2,1};                 // 2
        int[] arr_6 = {1,2,1,2,1,2,1};       // 2
        int[] arr_7 = {5,4,3,2,1};           // 5
        int[] arr_8 = {1,2,3,4,5};           // 5
        int[] arr_9 = {3,3,3,4,3,3};  // NOT valid input (has equal adjacent) — good for testing you're not relying
        // on strict-diff assumptions accidentally            // 4

        int[][] testArrays = {arr_1, arr_2, arr_3, arr_4, arr_5, arr_6, arr_7, arr_8,arr_9};

        for (int i = 0; i < testArrays.length; i++) {
            int index =  Peak_Element(testArrays[i]);
            System.out.printf("Peak Element of arr%d is : %d \n",i+1,index);
        }

    }
}

