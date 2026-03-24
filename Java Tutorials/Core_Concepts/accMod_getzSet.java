package Core_Concepts;

import java.util.Scanner;

public class accMod_getzSet {
    private int  id;
    private String name;
     public void setName(String n){
         name=n;
     }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        accMod_getzSet a=new accMod_getzSet();
        a.setName("Raghav");
        System.out.println(a.getName());
        a.setId(106);
        System.out.println(a.getId());
    }
}
