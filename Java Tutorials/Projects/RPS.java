package Projects;
import java.util.Scanner;
import java.util.Random;


public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("How many times you want to play this game? Type the number :  ");
        int t=sc.nextInt();
        sc.nextLine();  // String behaviour logic , refer to Strings section of JAVA one Note
        while(t-->0) {
            System.out.println("Enter your choice: rock, paper or scissors?");
            String user = sc.nextLine().toLowerCase();
            int compNumber = rd.nextInt(3); // 0,1,2 .here bound includes 0, and bound is to the value (n-1) excludes n
            // but   int compNumber=rd.nextInt(1,4); 1 is origin and 4 is bound, 1 is included but 4 is excluded
            String comp = "";     // empty string
            // compNumber assignment
            if (compNumber == 0) comp = "rock";
            if (compNumber == 1) comp = "paper";
            if (compNumber == 2) comp = "scissors";
            if("paper".equals(user)||"rock".equals(user)||"scissors".equals(user)) {
                System.out.println(rps(user, comp));
            }
            else{ System.out.println("Invalid input!");}
        }
    }
    // GAME LOGIC
    private static String rps(String user, String comp) {
        System.out.println("Computer chose : " + comp);
        if(user.equals(comp))
            return("Its a draw!");
        if (user.equals("rock") && comp.equals("scissors"))
            return ("🎉 You win! (rock beats scissors)");
        if (user.equals("paper") && comp.equals("rock"))
            return("🎉 You win! (paper beats rock)");
        if (user.equals("scissors") && comp.equals("paper"))
            return("🎉 You win! (scissors beats paper)");
        return "😢 You lose!";
    }

       


}
