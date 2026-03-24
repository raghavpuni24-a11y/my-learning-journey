package Core_Concepts;

public class staticBlock {
    public static void main(String[] args) {
        College c1=new College();
        c1.fees=1000;
        System.out.println(College.cllg +"-"+c1.fees);
        College c2=new College();
        College.cllg="MIT";
        c2.fees=2000;
        System.out.println(College.cllg +"-"+c2.fees);

    }
}
class College{
    static String  cllg;
    int fees;
    static{      // static block, will be called only once , independent of objects, but still the static variables are mutable
        cllg="Technocrats";
        System.out.println("static block called");
    }
     College(){
         System.out.println("Constructor called!");
     }
}
