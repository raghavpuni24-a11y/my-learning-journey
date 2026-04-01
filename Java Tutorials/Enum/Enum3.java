package Enum;

interface  Describable{
    void describe();
}
enum Status implements Describable{
    PENDING("Not yet processed!"),
    APPROVED("Successfully approved!"),
    REJECTED("Unfortunately rejected!");

    String msg;
    Status(String msg){
        this.msg=msg;
    }
    public void describe(){
        System.out.println(name() +": "+msg);// name() is for accessing the constant name stored in that object
    }
}
public class Enum3 {
    public static void main(String[] args) {
        Status s=Status.APPROVED;
        s.describe();
        // all statuses
        for (Status st :Status.values()){
            st.describe();
        }
    }
}
