package OOPS.InnerClass;
class College2{
    void showRanking(){
        int rank =42; // local Variable
        System.out.println("showRanking called! ");
        System.out.println("Creating obj of Ranking, the LIC and calling display() inside Ranking class ");
        class Ranking{    // Local Inner Class
            void display(){
                System.out.println("RGPV Rank: "+rank);  // local object can be accessed
            }
        }
        Ranking r=new Ranking(); // creating obj inside method
        r.display();
    }
  //  Ranking r1=new Ranking();    can't be accessed outside the method

}
public class LocalInnerClass {
    public static void main(String[] args) {
        College2 clg=new College2();
        clg.showRanking();
       // College2.Ranking=clg.new Ranking();   
    }
}
