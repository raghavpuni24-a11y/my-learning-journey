package OOPS.This;

class Sum {
    int x,y;
    void sum(int x,int y){
        System.out.println("Local values are: "+x+y);
        System.out.println("Accessing sum of instance variable using this keyword : instance x+y is : "+(this.x + this.y) ); // 
        System.out.println("Sum of local x and y: "+(x+y));
    }
}
public class sumDemo {
    public static void main(String[] args){
        Sum add=new Sum();
        add.x=8;
        add.y=10;
        add.sum(4,5);
    }

}
