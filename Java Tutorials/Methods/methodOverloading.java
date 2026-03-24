package Methods;

public class methodOverloading {
    static void display(){
        System.out.println("Good Morning bro!");
    }
    static void display(String a){   // Display method is overloaded with parameters
        System.out.printf("Good morning %s! ",a).println();
    }
    static int display(int a,int b){   // Display method is overloaded with diff parameters and diff return type
        System.out.printf("Good morning %s! ",a);
        int c=a+b;
        return c;
    }


    public static void main(String[] args) {
        display();
        display("Raghav"); // passing arguments
        display(3,4);

    }
}
