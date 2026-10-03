package Binary_Search;

//Setup: You've got a "mountain array" — values strictly increase, hit one peak, then strictly decrease. Like: 1, 3, 5, 8, 6, 4, 2. But you can't see the array directly — you can only ask "what's the value at index i?" via get(i), and you know the array's length via length().
//
//Goal: Given a target number, find the index where it occurs. If it's not in the array, return -1.
//
//Catch: Since the array first goes up then comes down, a value could theoretically appear twice (once on the way up, once on the way down) — but the problem guarantees each value is unique overall, so there's at most one occurrence. Still, you need to search efficiently (binary search, not scanning one by one) because of the call limit on get().
//
//Concretely, you need to:
//
//Find the peak index (where it stops increasing and starts decreasing).
//Binary search the left (increasing) half for the target.
//If not found there, binary search the right (decreasing) half.

import java.util.Scanner;

public class _09_Search_In_Mountain_Array {

    public static int Search_MA_(int[] arr, int target){
         int peak_index = findPeak(arr);   // got index of peak element
         int ans = search_Ascending(peak_index,arr,target);
         if(ans!=-1) return ans;
         else{
             ans=search_Descending(peak_index, arr, target);
             if(ans!=-1) return ans;
             else return -1;
         }

    }
    public static int findPeak( int[] arr){
        int start=0, end=arr.length-1;
        while(start < end){
            int mid= start + (end-start) /2;
            if(arr[mid] < arr[mid+1]){
                 start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public static int search_Ascending(int peak_index, int[] arr, int target){
        int start=0, end=peak_index;
        while(start<=end){
            int mid=start + (end-start) / 2;
            if(arr[mid]==target) return mid;
            else{
                if(arr[mid] < target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static int search_Descending(int peak_index, int[] arr, int target){
        int start=peak_index, end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start) / 2;
            if(arr[mid]==target) return mid;
            else{
                if(arr[mid] < target){
                  end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 4, 5, 3, 1};        // peak at index 4 (value 5), target say 3 → appears twice, but only one is "reachable" depending on which side you search first
        int[] arr2 = {0, 2, 4, 6, 8, 10, 9, 7, 5}; // peak at index 5 (value 10)
        int[] arr3 = {1, 5, 2};                     // small case, peak at index 1
        int[] arr4 = {3, 5, 3, 2, 0};               // peak at index 1, target 3 exists only on ascending side
        int[] arr5 = {1, 2, 3, 4, 5};               // edge case: peak is the last element (no descending side)

        int[][] testArrays = {arr1, arr2, arr3, arr4, arr5};

        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the target for arr%d: ",i+1);
            int target =sc.nextInt();
            int index =  Search_MA_(testArrays[i],target);
            if(index!=-1) System.out.println("Found at index: "+index);
            else System.out.println("Not Found!!");
        }

    }

}
