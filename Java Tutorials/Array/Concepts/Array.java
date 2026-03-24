package Array.Concepts;

import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
// Method 1
        int[] marks = new int[5];    // declaration + memory allocation
        // now insert elements in array
        marks[0] = 100;
        marks[1] = 60;
        System.out.println(Arrays.toString(marks));     // [100, 60, 0, 0, 0]
        System.out.println(marks[0]);    // 100
// Method 2
        int[] rollNo = {1, 2, 4, 5, 6};
        System.out.println(rollNo[2]);  // 4
// length of an array
        System.out.println(rollNo.length);  //5
// Displaying an array
        for (int i = 0; i < rollNo.length; i++) {
            System.out.print(rollNo[i] + ", ");
        }
// Confusions
        System.out.println(rollNo);         // [I@27716f4  -prints the address of the array
        System.out.println(Arrays.toString(rollNo));         //  [1, 2, 4, 5, 6]

        int[] id=new int[8];
        System.out.println(id[1]);   // 0
        String[] name=new String[6];
        System.out.println(name[3]);  // null




    }



}
