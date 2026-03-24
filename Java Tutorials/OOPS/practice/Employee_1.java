package OOPS.practice;

public class Employee_1 {
    int salary;
    String name;   // By-default, value of name is null
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name=n;
    }

    public static void main(String[] args) {
        Employee_1 raghav=new Employee_1();
        raghav.setName("Raghav");
        System.out.println(raghav.getName());
        raghav.salary=900;
        System.out.println(raghav.getSalary());
    }
}
