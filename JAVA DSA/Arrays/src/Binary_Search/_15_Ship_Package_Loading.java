package Binary_Search;

public class _15_Ship_Package_Loading {

    public static int Min_Packaging_Days(int[] arr, int days){
        int start=Max_element(arr), end= Sum_Arr(arr);  // can't split a package across days, so capacity must be >=
        // heaviest single package -- as a package is to be shipped at once, u can't break a package so min possible
        // weight to be shipped is the max weight
        // end = max possible capacity -- the sum of all the packages
        int n = end; // max packages that can be shipped at once is the sum of all elements - ship all
        // packages at once  -- max capacity
        while(start<=end){
            int k = start+(end-start)/2;     // BS key
            int sum_of_packages=0 , temp_days=0;
            for (int i = 0; i < arr.length; i++) {
                if( (sum_of_packages+arr[i] )<=k ) sum_of_packages+=arr[i];
                else{
                    sum_of_packages=arr[i];    // starting the sum_of_packages right from  the last unloaded package
                    temp_days++;  // till this, 1 day is consumed
                }
            }
            temp_days++; // since the extreme last package would be shipped successfully and the else for this would
            // never hit, so temp_days would never be counted for this,so at last , the last day must be counted
            if(temp_days <=days){
                end=k-1;
                n=k;
            }
            else{
                start=k+1;
            }
        }
        return n;
    }
    public static int Sum_Arr(int[] arr){
        int total_sum=0;
        for (int i = 0; i < arr.length; i++) {
            total_sum+=arr[i];
        }
        return total_sum;
    }
    public static int Max_element(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(Min_Packaging_Days(weights,days));
    }
}
