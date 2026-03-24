package Array.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(33);
        list.add(43);
        list.add(53);
        list.add(63);
        System.out.println(list); // simple printing: [23, 33, 43, 53, 63]
        System.out.println(list.contains(53)); // true
        list.set(0,100); // update the 0th index value to 100
        System.out.println(list);    //  [100, 33, 43, 53, 63]
        list.remove(2);
        System.out.println(list);    // [100, 33, 53, 63]
        System.out.println(list.get(2)); // print the element at index 2 , here 53
    // Input
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list2=new ArrayList<>(10);
        System.out.println("Give elements to be inserted in the list: ");
        for (int i = 0; i <10 ; i++) {
                   list2.add(sc.nextInt());
        }
        System.out.println(list2);

    }
}
