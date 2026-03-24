package Core_Concepts;
public class typeCasting1 {
    public static void main(String[] args){
        int i1=50;
        double d1=i1; // int to double can be type casted directly - automatic or implicit compilation
        System.out.println(d1);

        // from double to int
        double d2=67.89;
        int i2=(int)d2;// - Explicit or forceful conversion
        System.out.println(i2);
        // OR
        double d3=89.87;
        System.out.println((int)d3);

    }
}
