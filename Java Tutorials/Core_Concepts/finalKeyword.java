package Core_Concepts;
class Student{
    static final String COLLEGE="RGPV";
    static final int ID=106;
}
public class finalKeyword {
    public static void main(String[] args) {
             final int num=10;
//             num =12; this is restricted b/c can't reassign or redeclare if final keyword is used
        System.out.println(Student.COLLEGE);
        System.out.println(Student.ID);
//        Student.COLLEGE="TIT";  this not restricted

        
    }

}
