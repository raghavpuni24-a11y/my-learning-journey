package Binary_Search;
import java.util.Scanner;
// Search in Rotated Sorted Array II (with duplicates)
public class _05_RSA_Duplicates {

    public static int RSA_Duplicates_Search(int[] arr, int key){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]==arr[start] && arr[start]==arr[end] && arr[mid] == arr[end]){     // ambiguous case of duplicates- causes TC O(n)
                // It's checking: "are nums[start], nums[mid], and nums[end] all the exact same value?" When that's true, it means your current search window is completely flat — every element you can currently see is identical. In that situation, you have zero information about where the array actually rotates (or if it even rotates within this window at all). So the safest, laziest-but-correct move is: nudge both ends inward by one step each (start++, end--) and hope the flatness breaks so you get a real signal (a difference) to compare against
                
                start++;
                end--;
            }
            else{
                if( arr[mid] >= arr[start] ){  // pivot exists and search in LEFT part    == for single element case
                    if(arr[start]<=key && arr[mid]>key){     // key exists in left part
                        end=mid-1;
                    }
                    else{            // key exists in right part
                        start=mid+1;
                    }
                }
                else{   // searching the key in right part
                     if(arr[end]>=key && arr[mid]<key){  // key exists in right part
                         start=mid+1;
                     }
                     else{         // key exists in left part
                         end=mid-1;
                     }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 = {4,5,6,7,0,1,2};        // no duplicates, target exists (mid-side clean)
        int[] arr2 = {4,5,6,7,0,1,2};        // same array, target = 3 (doesn't exist)
        int[] arr3 = {2,5,6,0,0,1,2};        // classic LC example, target = 0
        int[] arr4 = {2,5,6,0,0,1,2};        // same, target = 3 (doesn't exist)
        int[] arr5 = {1,0,1,1,1};            // target = 0, ambiguous start/mid/end collision
        int[] arr6 = {1,1,1,1,1,2,1};        // target = 2, worst-case O(n) trigger
        int[] arr7 = {1,1,1,1,1,1,1};        // all duplicates, target not present (say 2)
        int[] arr8 = {3,1,2,3,3,3,3};        // our earlier example, target = 2
        int[] arr9 = {5,1,3};                // small odd-length, no dupes, target = 3
        int[] arr10 = {1};                   // single element, target = 1
        int[] arr11 = {1};                   // single element, target = 2 (not present)
        int[] arr12 = {1,3};                 // two elements, rotated trivially, target = 1
        int[] arr13 = {};                    // empty array, target = anything, e.g. 1
        int[] arr14 = {1,1,1,3,1};           // the earlier "naive jump breaks" case, target = 3
        int[] arr15 = {2,2,2,3,4,2};         // target = 3, ambiguous but resolvable case
        
        int[][] testArrays={arr1,arr2,arr3,arr4,arr5,arr6,arr7,arr8,arr9,arr10,arr11,arr12,arr13,arr14,arr15};

        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the key for arr%d: \n",i+1);
            int key=sc.nextInt();
            int min = RSA_Duplicates_Search(testArrays[i],key);
            System.out.println("Min element : " + min) ;
        }


    }
}
