package Methods;

public class changeDemo {
    static void hello(){
        System.out.println("Hello World!");
    }
    static int changeInt(int a){
        a=45;
        return a;
    }
    static void changeArr(int[] arr){   // arr is a reference of the array marks[]
        arr[0]=90;
    }
    static int swap(int a,int b){
        int temp= a ;
        a=b;
        b=temp;
        return a;
    }

    public static void main(String[] args) {
        hello(); // CALLING hello()
    // changing variable : can't be changed through methods
        int a=60;// priority of value of var in main method > any other global function
        changeInt(a);
        System.out.println(changeInt(a)) ; // 45
        System.out.println("The value of a after running changeInt is: "+a);  // 60 , it will not affect the variable's value in main method
    // changing value of an array element:
        // In case of array, the reference is passed, so its value can be changed in the main func from the global function , b/c array will be passed as the memory of the address of the element not the true value but the reference
        int []marks={45,79,78,69,80};
        changeArr(marks); // passing array marks as a reference of the elements
        System.out.println(marks[0]+" - getting the 0 index value explicitly from main");// 90
    //Swapping concept and confusions
        int x=10,y=20;
        System.out.println(swap(x,y)); // x= 20 : return from swap()
        System.out.println(x); // x= 10, since value of x is 10 in main














    }



}

