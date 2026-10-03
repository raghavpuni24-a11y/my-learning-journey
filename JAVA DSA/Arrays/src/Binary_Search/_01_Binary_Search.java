package Binary_Search;

// Given a sorted array and a target value, find the index of the target. If not found, return -1.

// RULE : IN WHILE() -- USE <= WHEN U HAVE A TARGET VALUE THAT COULD BE PRESENT OR NOT...
//                   -- USE < WHEN U KNOW THERE EXISTS AN ANSWER NECESSARILY FOR SURE

import java.util.Scanner;

public class _01_Binary_Search {
    public static int Search_element(int[] arr, int key){
        int start=0,end=arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) return mid;
            if(arr[mid] < key){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr1={12,23,45,56,78,89,90,95}; // sorted array
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        int index=Search_element(arr1,key);
        if(index== -1) System.out.println("Not found!!");
        else {
            System.out.println("Index : " +index);
        }
    }
}
