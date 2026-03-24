package Array.arrayOfObjects;

public class Student {
  int rollno , marks;
  String name;
}
class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=1;
        s1.marks=40;
        s1.name="Raghav";

        Student s2=new Student();
        s2.rollno=2;
        s2.marks=50;
        s2.name="Prince";

        Student s3=new Student();
        s3.rollno=3;
        s3.marks=60;
        s3.name="Akshu";

        Student students[]=new Student[3];   // array of objects of Student class , you have to manually create the
        // objects and then the array of objects will contain the references of the objects you inserted.HERE, the
        // DATA TYPE is a class Student, not int or any primitive dt
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].name +" : "+students[i].marks);
        }
        // By for each loop
        for(Student a:students){ // Since the dt id a class-Student, so instead of int a,Student a is used
            System.out.println(a.name +" : "+a.marks);
        }
    }
}

