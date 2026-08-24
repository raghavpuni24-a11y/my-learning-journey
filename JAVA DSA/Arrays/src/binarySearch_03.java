import java.sql.SQLOutput;
import java.util.Scanner;

///  FOR SORTED ARRAYS    : // TC  : O( log(n) )
public class binarySearch_03 {
    public static int BinarySearch(int[] num,int key){
       int start=0, end=num.length-1; // pointers
       while(start<=end){
           int mid=(start+end)/2;
           if(num[mid]==key){
               return  mid;
           }
           else if(num[mid] < key){      // right
               start=mid+1;
           }
           else{                       // left
               end=mid-1;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num={12,23,45,46,48,67,69,78,79,83,85,88,90};
        System.out.println("Enter the element to be searched : ");
        int key=sc.nextInt();
        int index=BinarySearch(num,key);
        if(index!=-1) System.out.printf("The element %d is at the index : %d ",key,index);
        else{
            System.out.println("Required element doesn't exist!!");
        }
    }
}
