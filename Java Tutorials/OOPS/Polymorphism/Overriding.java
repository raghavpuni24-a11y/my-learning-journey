package OOPS.Polymorphism;

class Calc{
    public int add(int a,int b){
        return a+b;
    }
}
class Advcalc extends Calc{
    public int add(int a, int b){
        return a+b+1;  // add method overrided
    }
}
public class Overriding {
    public static void main(String[] args) {
        Advcalc x=new Advcalc();
        int r=x.add(4,6);   // 11
        System.out.println(r);

        Advcalc y=new Advcalc();
        int s=y.add(7,8);   // 11
        System.out.println(s);

    }
}
