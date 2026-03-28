package Methods;

public class methods_static {
    int m=8; // can't be used directly in a static method, unless referenced by an object , ex in 3rd method show
    static String str="A static variable";     // can be used in a static method
    // Making global static methods for sum function
    static int sum(int x,int y){      // static keyword is used to call that method even without creating the object of that class, directly by passing the values
        int z;
        z=x+y; // z=x+y+m will give the error of using instance variable in a static method
        System.out.println(str);
        // System.out.println(m);  ERROR: Non-static field 'm' cannot be referenced from a static context, make m static
        return z;
    }
    int diff(int p,int q){    // non-static functions can't be called without creating the objects of the class
        int r=p-q;
        return r;
    }
    static void show(methods_static obj){
        System.out.println(obj.m); // now the instance variable can be used in the static method by referencing through an object
            }

    public static void main(String[] args) {
        // Directly calling the static method :sum
        int a=9,b=7;
        int c=sum(a,b);  // passing variables as values         
        int d=sum(4,5); // passing direct values
        System.out.println(methods_static.sum(6,7)); // can be directly called by the class name
        System.out.println(c+","+d);

        // By creating object of the class "methods", calling non-static method: diff
        methods_static md=new methods_static();
        int e= md.diff(5,9);
        System.out.println(e);

    // accessing an instance variable in a static class by referencing an object
        methods_static m1=new methods_static();
        m1.m=10;
        methods_static.show(m1); // passing m1 as object reference in the static method show()
    }
}
