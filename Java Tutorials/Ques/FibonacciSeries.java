package Ques;

public class FibonacciSeries { // 0 1 1 2 3 5 8 13 21 ...
                               // 0 1 2 3 4 5 6  7  8 ....  -- index
    // if not mentioned to start from the index , then default starting index will be the 1st 1.
    // Print the nth term of the f series, using default starting index 1's value as 0
    static int fSeries(int n){
//        if (n==1)  // 1st term
//            return 0;
//        else if(n==2)
//            return 1;
        // OR
        if(n==1 || n==2 )
            return n-1;
        else
            return fSeries(n-1)+ fSeries(n-2);//
    }
    public static void main(String[] args) {
        int n=4;  // output will be n+1 th term
        System.out.println(fSeries(n));
    }

}


