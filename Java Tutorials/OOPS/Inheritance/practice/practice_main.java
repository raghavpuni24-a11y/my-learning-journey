package OOPS.Inheritance.practice;
//Problem 1
class Circle{
    public int radius;
    Circle(int r){ // Constructor
        this.radius=r;
        System.out.println("I am a circle");
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        this.height=h;
        System.out.println("I am a cylinder");
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
// Problem 2
class Rectangle{
    private int length,breadth;
    Rectangle(int l,int b){  // constructor
        this.length=l;  // constructor can access private data
        this.breadth=b;
        System.out.println("I am a rectangle");
    }
    // Getters and Setters
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public double areaR(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
   private int height;
    Cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
        System.out.println("Cuboid");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volumeC(){
        return getLength()*getBreadth()*height;
    }

}

public class practice_main {
    public static void main(String[] args)  {
        //Problem 1
        Circle a = new Circle(5);
        System.out.println(a.area());
        Cylinder obj=new Cylinder(6,7);
        System.out.println(obj.volume());
        // Problem 2 using getters and setters

        Rectangle rt=new Rectangle(4,5); // are should be 20 but ... below
        rt.setBreadth(10); // now setBreadth has greater priority than constructor
        System.out.println(rt.areaR()+ "; "); // so area is 40
        Cuboid cb=new Cuboid(5,6,7);
        System.out.println(cb.areaR()+" "+ cb.volumeC()); //30 210


    }
}
