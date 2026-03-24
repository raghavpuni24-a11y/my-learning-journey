package OOPS.practice;

public class square_3 {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

    public static void main(String[] args) {
        
        square_3 a=new square_3();
        a.side=8;
        System.out.println(a.area());
        System.out.println(a.perimeter());

    }
}
