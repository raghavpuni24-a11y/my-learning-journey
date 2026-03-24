package Strings;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer(); // sb is now MUTABLE bc of StringBuffer
        System.out.println(sb.capacity());// default capacity- 16 , it will give u the 16 size buffer space. In case of changing the string and there is no necessary contiguous memory present in the heap, then to help prevent this case, StringBuffer gives u extra 16 spaces for such type of cases
        System.out.println(sb.length()); //0

        StringBuffer name=new StringBuffer("Raghav");
        System.out.println(name.capacity());// 22- 16+6
        System.out.println(name.length());// 6
        name.append(" Parashar");   // method for concatenation
        System.out.println(name); // Raghav Parashar
    }
}
