package OOPS.InnerClass;

//REGULAR INNER CLASS
class College{
    String name="RGPV";
    String location="Bhopal";
    // RIC
    class Dept{
        String deptName="AI&DS";
        void display(){
            // Access Outer class directly
            System.out.println("College: "+name);
            System.out.println("location: "+location);
            System.out.println("DeptName: "+deptName);
        }
    }
    class Student{
        String name="Raghav";
        int rollNo= 106;
        void display(){
            System.out.println(name+" : "+rollNo);
        }
    }
}

public class RegularInnerClass {
    public static void main(String[] args) {
//ACCESSING REGULAR INNER CLASS
        College clg=new College();
        College.Dept dept= clg.new Dept();// as object is used to call the data of that class, so, clg object is used
        //  to instantiate the obj of Dept class, b/c it is regular, not static
        dept.display();
        College.Student std=clg.new Student();
        std.display();

    }
}
