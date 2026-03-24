package Strings;

public class Immutability {
    public static void main(String[] args) {
        String name ="Raghav";   // name is created and hence can't be changed or is immutable, its memory has been fixed and can't be changed
        System.out.println(name);
         name = name +" Parashar";  // here the name is not changed, the previous name's memory is ready for garbage and the creation the new name is allocated at some new memory and hence the previous name is never touched in the whole process
        System.out.println(name);// hence Strings are immutable in java
        String s1="Prince";
        String s2="Prince";

    }
}
