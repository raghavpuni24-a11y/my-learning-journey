package OOPS.Constructor;

public class studentDemo {
    public static void main(String[] args){
    //Object 1
        Student st1;// object created
        st1 = new Student();// new keyword will allocate memory for the object st1 and default constructor
       st1.name="Raghav";
       st1.stdID=1106;
       st1.city="Bhopal";
// Accessing data methods
       st1.study();
       st1.showFullDetails();
    // Object 2
        Student st2;// object created
        st2 = new Student(12);// Parametrized constructor
        st2.name="Prince";
        st2.stdID=1101;
        st2.city="Patna";
// Accessing data methods
        st2.study();
        st2.showFullDetails();

    }
}
