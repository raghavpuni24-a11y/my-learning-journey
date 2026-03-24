package Core_Concepts;
import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day");
        String day=sc.next();
        switch (day){
            case "Monday":
                System.out.println("day 1 ");
                break;
            case "Tuesday":
                System.out.println("day 2 ");
                break;
            case "Wednesday":
                System.out.println("day 3");
                break;
            default:
                System.out.println("invalid day");

        }

    }
}
