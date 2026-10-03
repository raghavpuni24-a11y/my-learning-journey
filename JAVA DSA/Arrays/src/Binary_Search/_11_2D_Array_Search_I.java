package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

// The problem: You're given an m x n matrix with two properties:
//
//Each row is sorted left to right.
//The first element of each row is greater than the last element of the previous row (meaning if you "unrolled" the whole matrix into one line, it'd be fully sorted).
//
//Find whether target exists in the matrix. Return true/false.

public class _11_2D_Array_Search_I {

    public static int[] _2DMatrix_Target_Search(int[][] matrix , int target){

         int m=matrix.length;  // m rows
         if(m==0 ) return new int[]{-1,-1};
         int n= matrix[0].length;    // n columns
         int start=0,end= m*n-1;
         while(start<=end){
             int mid=start+(end-start)/2;          // treating mid as a flat index element - treating 2d sorted array as a flat 1d array
             int row = mid/n ;     // row's index
             int col = mid%n ;     // col's index
             if(matrix[row][col]==target) return new int[]{row,col};
             else if (matrix[row][col] < target){
                 start=mid+1;
             }
             else {
                 end=mid-1;
             }
         }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};   // target = 3  -> expected: true
        int[][] matrix2 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};   // target = 13 -> expected: false
        int[][] matrix3 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};   // target = 1  -> expected: true (first element)
        int[][] matrix4 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};   // target = 60 -> expected: true (last element)
        int[][] matrix5 = {{1}};                                     // target = 1  -> expected: true (single cell, matches)
        int[][] matrix6 = {{1}};                                     // target = 5  -> expected: false (single cell, no match)
        int[][] matrix7 = {{1,3,5}};                                 // target = 3  -> expected: true (single row)
        int[][] matrix8 = {{1},{3},{5}};                             // target = 5  -> expected: true (single column)
        int[][] matrix9 = {};                                        // target = 5  -> expected: false (empty matrix)

        int[][][] testArrays = {matrix1, matrix2, matrix3, matrix4,matrix5,matrix6,matrix7,matrix8, matrix9};
        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the target for matrix%d : ",i+1);
            int target=sc.nextInt();
             int[] ans = _2DMatrix_Target_Search(testArrays[i],target)  ;
             if(ans[0]==-1) System.out.println("Not found!!");
             else System.out.println("Found at : "+ Arrays.toString(ans));
        }

    }
}
