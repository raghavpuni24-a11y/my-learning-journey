package Binary_Search;

public class _14_Koko_Eating_Bananas {

    public static int canFinish(int[] arr, int h, int max){
        int start=1, end=max;   // start = slowest possible speed (1 banana/hr)
        // end = fastest speed needed (finish any single pile in 1 hr)
        int n= arr.length;      // lower bound on hours — every pile takes >=1 hr regardless of k
        // (kept for clarity, but temp_n>=n is always true — see note below)
        int ans=max;             // fallback: slowest guaranteed-feasible speed if nothing tighter is found

        while(start<=end){
            int k= start + (end-start)/2;   // k = candidate eating speed being tested (NOT an array index)
            int temp_n=0;

            for (int i = 0; i < arr.length; i++) {
                temp_n += (arr[i]+k-1)/k;   // ceil(arr[i]/k) via integer division —
                // total hours needed to finish this pile at speed k
                // Replacement of this:
                //                if(arr[i]<=k)            temp_n++;
                //                else if(arr[i] % k==0)   temp_n+= (arr[i]/k);
                //                else                     temp_n += (arr[i]/k + 1);
            }

            if(temp_n >= n && temp_n <=h ) {
                // temp_n>=n is always true (proven: sum of per-pile hours can't be less than arr.length)
                // real constraint is temp_n<=h — speed k finishes within allowed hours
                n = temp_n;
                end=k-1;    // try slower speed — might still be feasible, and we want the minimum
                ans=k;      // record this as our best-so-far feasible (and minimal) speed
            }
            else{
                start=k+1;  // k too slow, need to eat faster
            }
        }
        return ans;
    }
    public static int Max_element(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 11}; int h1 = 8;   // expected: 4

        int[] arr2 = {30, 11, 23, 4, 20}; int h2 = 5;  // expected: 30

        int[] arr3 = {30, 11, 23, 4, 20}; int h3 = 6;  // expected: 23

        int[] arr4 = {312884470}; int h4 = 312884469; // expected: 2 (single huge pile, edge case)

        int[] arr5 = {1, 1, 1, 1}; int h5 = 4;   // expected: 1 (k=1 exactly meets h)

        int[] arr6 = {10}; int h6 = 2;           // expected: 5 ( 10/5=2 exactly)

        int[] arr7 = {10}; int h7 = 3;           // expected: 4 (ceil(10/4)=3, ceil(10/3)=4 wait check by hand)

        int[] arr8 = {5, 5, 5, 5}; int h8 = 4;   // expected: 5 (tightest possible h == n)

        int[][] testArrays = {arr1, arr2, arr3, arr4, arr5,arr6,arr7,arr8};
        int[] test_h={h1,h2,h3,h4,h5,h6,h7,h8};
        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Min iterations for arr%d is : ",i+1);
            int max=Max_element(testArrays[i]);
            System.out.println(canFinish(testArrays[i],test_h[i],max));
        }
    }
}
