package Methods;

public class shadowing {
    static int x=20; // global scope; shadowed in ln 8; only when initialization happens
    public static void main(String[] args) {
        System.out.println("1]"+x); // 20
        fun();  // 20
        int x=10;// reassignment of x in main, local scope; here both declaration and initialization happened
        System.out.println("main-"+x);// 10
        fun(); //20
    }
    static void fun(){
        System.out.println("fun-"+x); // using x of global scope
    }
}
