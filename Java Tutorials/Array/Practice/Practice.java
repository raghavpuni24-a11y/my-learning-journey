package Array.Practice;

public class  Practice {
    public static void main(String[] args) {
        // Q1
        float []fl={5.5f,4.9f,8.9f,2.9f,5.7f};
        System.out.println(fl.length); // no. of elements=5
        float  sum=0;
        for (float element:fl) {
            sum+=element;
        }
        System.out.println(sum);
        // Q2,  Boolean Approach
        float x=5.5f;
        boolean isInArray=false;

        for (float element:fl) {
            if(element==x){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The element is present in the array.");
        }
        else{
            System.out.println("The element is not present in the array.");
        }
        //Q3 Average of the sum
        float avg = sum/(fl.length);
        System.out.println("The value of avg marks is : "+avg );
        // Q4  Addition of Matrices 2-D
        int [][]mat1={ {1,2,3},  // 2*3 matrix
                       {4,5,6}  };
        int [][]mat2={ {7 ,8 ,9},  // 2*3 matrix
                       {10,11,12}  };
        int [][]res={ {0,0,0},  // 2*3 matrix- Resultant matrix
                      {0,0,0}  };
        System.out.println(mat1.length +","+ mat1[0].length);// No. of rows and columns or elements in the 1st outer array
        for (int i = 0; i < mat1.length; i++) {   // Row no. of times
            for (int j = 0; j < mat1[i].length; j++) { // Column no. of times
                res[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf("Setting value for i=%d and j=%d is %d\n",i,j,res[i][j]);
            }
        }
        for (int i = 0; i < res.length; i++) { // for rows
            for (int j = 0; j < res[i].length; j++) { // for columns
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    // Q5 Reverse an Array
        float a=5,b=2;
        System.out.println(a/b); // 2.5 but by using the math.floorDiv class we will get the greatest integer
        float c=Math.floorDiv(5,2);
        System.out.println(c); //2.0, the greatest integer for 2.5

        int []arr1={1,2,3,4,5};
        int l= arr1.length;
        int m=Math.floorDiv(l,2); // to define the greatest integer for the mid-point integer
        for (int i = 0; i < m; i++) {
            // Simple swapping:
           int temp;
           temp=arr1[i];
           arr1[i]=arr1[l-1-i];// for swapping elements of lhs of mid-point
           arr1[l-1-i]=temp;//for swapping elements of rhs of mid-point
        }
        for (int element:arr1) {
            System.out.print(element+","); // 5,4,3,2,1,
        }
        System.out.println();
    // Q6: Max element in an array, using prev arr1
        int max=0;
        for (int element:arr1){
            if(element>max){
                max=element;
            }
        }
        System.out.println("Max element in the array arr1 is : "+ max);
        // In java, the default max and min values are:
        System.out.println(Integer.MAX_VALUE+","+Integer.MIN_VALUE); // 2147483647,-2147483648
        // So instead of using max=0 or min=0 , use these value , when you don't know the limiting min or max element in that array
    // Q7: Min element in an array
        int min=Integer.MAX_VALUE;
        for (int e:arr1){
            if(e<min)
                min=e;
        }
        System.out.println("The min element in the array arr1 is : "+min);







    }
}
