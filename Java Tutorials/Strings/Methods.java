package Strings;

public class Methods {
    public static void main(String[] args) {
    int a=4;
    float b=9.875389f;
    // 1] Spacing and readability
        System.out.printf(" Value of a is %2d and b is %5.3f",a,b ).println();// 2d means it will occupy 2 whitespaces area before
          // printing the value and 5.3f means it will occupy 5 ... and .3 means it will read and print only up to 3 decimal places
    // 2] Length
        String name = "Raghav";
        System.out.println(name.length());
    // 3] To Upper case
        System.out.println(name.toUpperCase());
    // 4] To lower case
        System.out.println(name.toLowerCase() );
    // 5] trim
        String x="     My name is Raghav     ";
        System.out.println(x + " Parashar");
        System.out.println(x.trim() + "Parashar");                                    //             R A G H A V
    // 6]  Substring will print from the index value you provided, index values same as of array     0 1 2 3 4 5
        System.out.println(name.substring(1,4));  // begin index value will include that element but end Index value EXCLUDE that element
    // 7] replace
        String y="Harry";
        System.out.println(y.replace('r','p'));  // char, so 'r' and 'p'
        System.out.println(y.replace("rry","ndsome"));
    // 8] startsWith and endsWith : if yes, then true. If not then false.
        System.out.println(name.startsWith("Rag"));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("Hav"));
    // 9]charAt : prints the char at that index value
        System.out.println(name.charAt(3)); // h
    // 10] indexOf : will print the first occurrence of the first char in the string or simply that character
        String name2="Raghavghav";
        //            0123456789
        System.out.println(name2.indexOf('a'));  //1
        System.out.println(name2.indexOf("gha"));   //2
        System.out.println(name2.indexOf("ghav",5));// 6: it will start counting form index value 5
        System.out.println(name2.indexOf("ghar",4));// -1 : it will return -1 if the condition provided does not match with the default value
        System.out.println(name2.lastIndexOf('a'));//8
        System.out.println(name2.lastIndexOf("ghav"));//6
        System.out.println(name2.lastIndexOf("av",5));// it will read from backwards and start indexing from backwards but will give the same index value as output as default
        System.out.println(name.equals("Raghav"));// true as per pas written above, NOTE: Java is case-sensitive
        System.out.println(name.equalsIgnoreCase("RAGHAV"));// will ignore case sensitivity, output is true here

    // 11] Sequence characters: \n (new line), \t (tab) , \ (single quote) , \\ (backlash) and so on
        System.out.println("I am a escape sequence \"double quote\" ");// I am a escape sequence "double quote"
        System.out.println(" Its a tab quote\thello!"); //  Its a tab quote	hello!
        System.out.println("Its a backspace quote\b   hye");// Its a backspace quot   hye
        System.out.println("Its a carriage return quote \r hello"); // hello
        System.out.println("Its a form feed quote \f hello"); // Its a form feed quote  hello
        System.out.println("Its a backlash quote \\ hello");// Its a backlash quote \ hello
    }
}
