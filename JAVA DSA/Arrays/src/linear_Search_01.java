public class linear_Search_01 {
    public static int linearSearch(int[] num, int key){
        for (int i = 0; i < num.length; i++) {
            if(num[i]==key){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60,70,90}  ;
        int key=50;
        int index=linearSearch(num,key);
        if(index==-1) System.out.println("Not Found!");
        else System.out.println("Index = "+index);
    }
}
// TC  : O(n)
