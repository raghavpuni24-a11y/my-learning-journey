package Array.multiDArrays;

import java.util.Arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        int [][]flats=new int[2][3];// 2 rows and 3 columns
        flats [0] [0] = 101;
        flats [0] [1] = 102;
        flats [0] [2] = 103;
        flats [1] [0] = 201;
        flats [1] [1] = 202;
        flats [1] [2] = 203;
    // Respective lengths
        System.out.println(flats.length);// 2 , this will give the no. of rows , OR the no. of outer arrays
        System.out.println(flats[0].length);// 3 , this will give the no. of elements in the 1st row/ 1st outer array, i.e. no. of columns
    // Common confusions
        System.out.println(flats[0]);  // [I@27716f4 b/c flats[0] is itself an array of 1 row and 3 columns
        System.out.println(Arrays.toString(flats[0]));      // [101, 102, 103]
    // defining the no of columns is not mandatory
         int[][] id=new int[2][] ;   // this is valid
     // DISPLAYING 2-D ARRAY ELEMENTS
        for (int i = 0; i < flats.length; i++) { // for rows
            for (int j = 0; j < flats[0].length; j++) { // for columns
                System.out.print("["+i+","+j+"] = "+flats[i][j]+", ");
            }
            System.out.println();
        }

        int [][]r3={{1,2,3},    // 3*3 matrix
                    {4,5,6},
                    {7,8,9}};
        System.out.println(r3.length+","+ r3[0].length); //3,3 : Rows of r3 array  and columns  of r3[0] array or the 1st subarray

        
    }


}
