package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;
// Write an efficient algorithm that searches for a value target in an m x n integer matrix 'matrix'. This matrix has the following properties:

//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.

public class _12_2D_Array_Search_II {

    public static int[] Search_in_2D_Array(int[][] matrix, int target){
        int m = matrix.length;   //  no. of rows
        if( m==0 ) return new int[]{-1,-1};
        int n = matrix[0].length; // no. of columns
        int row = 0, col = n-1;      // row and col indices
        while( row < m && col>=0 ){
            if( matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if( matrix[row][col] < target ){          //  the entire row is now useless (everything left in this row is even smaller)... so what should you do to row
                row++;
            }
            else{                   // the entire column col is now useless (everything below is even bigger, since columns are sorted top-to-bottom)
                col--;
            }

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] matrix1 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};  // target = 5  -> expected: true
        int[][] matrix2 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};  // target = 20 -> expected: false
        int[][] matrix3 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};  // target = 30 -> expected: true (last element, bottom-right)
        int[][] matrix4 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};  // target = 1  -> expected: true (first element, top-left)
        int[][] matrix5 = {{1}};                                                                          // target = 1  -> expected: true (single cell, matches)
        int[][] matrix6 = {{1}};                                                                          // target = 2  -> expected: false (single cell, no match)
        int[][] matrix7 = {{1,2,3,4,5}};                                                                  // target = 4  -> expected: true (single row)
        int[][] matrix8 = {{1},{2},{3},{4},{5}};                                                          // target = 4  -> expected: true (single column)
        int[][] matrix9 = {};                                                                             // target = 5  -> expected: false (empty matrix)

        int[][][] testArrays = {matrix1, matrix2, matrix3, matrix4,matrix5,matrix6,matrix7,matrix8, matrix9};
        for (int i = 0; i < testArrays.length; i++) {
            System.out.printf("Enter the target for matrix%d : ",i+1);
            int target=sc.nextInt();
            int[] ans = Search_in_2D_Array(testArrays[i],target)  ;
            if(ans[0]==-1) System.out.println("Not found!!");
            else System.out.println("Found at : "+ Arrays.toString(ans));
        }
    }
}
