package Two_Pointers;

import java.util.Arrays;
// O(m+n) tc
public class _08_Merge_Sorted_Arrays {
    public static int[] Merge_Arr(int[] nums1, int[] nums2, int m){
        int n= nums2.length-1; // m=no. of elements in nums1 == last index of nums1 as per non zero element
        int i= nums1.length -1;    //  real last index of nums1
        
        while(i>=0 && n>=0){  //  i>=0 b/c tracing nums1 using i till the very first index element nums[0] and n>=0
            // for
            if(nums1[m]<=nums2[n] ){
                nums1[i]= nums2[n];
                n--;
                i--;
            }
            else{
                nums1[i]=nums1[m];
//                nums1[m]=0;
                m--;
                i--;
                // check  if m is 0 , then place all the remaining elem of nums2 in nums1 as-is
                if(m==-1){
                     while(n>=0){
                         nums1[i]=nums2[n];
                         n--;
                         i--;
                     }
                     return nums1;
                }

            }
        }

        return nums1;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,0,0,0,0};            // redefine m for every test case in the public method
        int[] arr2 = {1,2,3,4};
        int m=0;
        System.out.println(Arrays.toString(Merge_Arr(arr1,arr2,m)));


    }
}
