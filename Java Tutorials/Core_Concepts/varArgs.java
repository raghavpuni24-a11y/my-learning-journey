package Core_Concepts;

public class varArgs {
    static int sum(int ...arr){   // ...arr will behave like an array of parameters
        // which will accept any no. of arguments you've passed but with same return type
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return sum;
    }
    static int avg(int ...arr){
        int count=arr.length;
        int sum=sum(arr);
        return sum/count;
    }
    public static void main(String[] args) {
        System.out.println(sum()); // will return 0 b/c of the empty array
        System.out.println(sum(2,3,4));
        System.out.println(sum(87,88,59,30,60,339));
        System.out.println(avg(45,56,67,78,89,90));
    }
}
