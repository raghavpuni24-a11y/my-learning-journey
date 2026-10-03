package Binary_Search;

// Problem gist: array sorted ascending, then rotated at unknown pivot (e.g. [4,5,6,7,0,1,2]). Find target's index in O(log n). --- Binary Search

import java.util.Scanner;



public class _03_Rotated_Array_Search {

    public static int search_In_Rotated_Array(int[] arr, int key){

        int start=0 , end=arr.length-1 ;
        
        while(start<=end){
            int mid= start + (end-start)  / 2;
            if(arr[mid]==key){                // found case
               return mid;
            }
            if( arr[mid] >= arr[start] ) {   // pivot case -- pivot exists --  LEFT sorted  part
                if( arr[start] <= key && arr[mid] > key )   // check if key exists in LEFT sorted half
                    end=mid-1;
                else{   // key exists in  right half
                    start = mid+1;   // key exists in right sorted half
                }
            }
            else{              // right half is sorted
                if( arr[mid] < key && key <= arr[end] ){   // key exists in right half
                    start=mid+1;
                }  else{            // key exists in left half
                    end=mid-1;
                }
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={4,5,6,7,0,1,2};
        int[] arr2={1,2,3,4,5}; // No rotation
        int[] arr3={5,1,2,3,4};  // rotated at last index
        int[] arr4 = {1};
        int[] arr5 = {1,2};
        int[][] testArrays = { arr1, arr2, arr3, arr4, arr5 };
        for (int i = 0; i < testArrays.length; i++) {
            System.out.println("Enter the Key : ");
            int key = sc.nextInt();
            int index = search_In_Rotated_Array(testArrays[i], key);
            if(index!=-1) System.out.println("Index : "+ index);
            else System.out.println("Not found!!");
        }

    }
}
