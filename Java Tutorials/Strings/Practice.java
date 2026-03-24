package Strings;

public class Practice {
    public static void main(String[] args) {
        String name= "Raghav ";
        System.out.println(name.toLowerCase());

        String s2= "hello world!";
        System.out.println(s2.replace(' ','_'));

        String s3="Dear |<name>|, Thanks a lot!";// to easily spot the variable or to avoid modifying characters accidentally
        System.out.println(s3.replace("|<name>|","Prince"));

        String s4="This string contains double  and  triple       spaces";
         //        01234567890123456789012345678901234567890123456789
        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));

        String s5="Dear Prince,\n\t Your kindness is great.\nThanks";
        System.out.println(s5);

    }
}
