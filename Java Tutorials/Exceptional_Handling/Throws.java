package Exceptional_Handling;

public class Throws {
    static void readFile(String name) throws Exception{
        if(name==null){
            throw new Exception("Filename can't be null!");
        }
        System.out.println("Reading file: "+name);
    }
    public static void main(String[] args) {
        // Compiler FORCES u to handle it — can't ignore!
       try{
           readFile(null);
       }
       catch(Exception e){
           System.out.println("Exception caught:- "+ e.getMessage());
       }
    }
}
