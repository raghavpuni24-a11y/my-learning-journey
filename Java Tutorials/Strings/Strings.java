package Strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //Defining Strings by 2 forms and FORMAT SPECIFIERS using printf
        String name=new String("Raghav"); // As a class
        System.out.println(name.charAt(2));//g
        String Lastname= "Parashar";             // can be used as a data type, but not a dt in java, it is a class
        int a=19;
        float b=5.6f;
        char c='R';
        System.out.printf("My name is %s %s , my age is %d and my height is %f and my favorite character is %c ",name, Lastname,a,b,c).println();
        // STRING INPUT
        Scanner sc=new Scanner(System.in);// making object for Scanner class
        System.out.println("Enter your name:");
        String n=sc.nextLine(); // will read/ take input of your content
        System.out.println("Enter your College name:");
        String str=sc.next();// will read up to your first word only
        System.out.printf("You entered:%s %s",n,str);

  }
}
