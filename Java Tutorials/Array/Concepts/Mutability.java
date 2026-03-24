package Array.Concepts;

public class Mutability {
    static void changeArr(int[] arr){   // arr is a reference of the array marks[]
        arr[0]=90;
    }
    static void changeArr(String[] arr){   // arr is a reference of the array name[]
        arr[0]="90";
    }
    public static void main(String[] args) {
        // changing value of an array element:
        // In case of array, the reference is passed, so its value can be changed in the main func from the global function , b/c array will be passed as the memory of the address of the element not the true value but the reference
        int []marks={45,79,78,69,80};
        changeArr(marks); // passing array marks as a reference of the elements
        System.out.println(marks[0]+" - getting the 0 index value explicitly from main");// 90
        String[] name={"Raghav","Prince","Rashi"};
        changeArr(name);
        System.out.println(name[0]);   //  90
    }
}
