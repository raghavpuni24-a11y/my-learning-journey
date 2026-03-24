package Methods;

public class blockScope {
    public static void main(String[] args) {
        int a=10;
        {
//            int a =9;   //   error b/c you can't reinitialize the var inside a block
            a=9;  // can be modified
            int c=18;  // scope is limited only inside the block b/c you can't initialized-in-block var outside the block
        }
//        System.out.println(c);  // can't use var c outside block b/c
        System.out.println(a); // 9
    }
}
