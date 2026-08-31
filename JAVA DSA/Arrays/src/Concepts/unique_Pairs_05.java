
public class unique_Pairs_05 {
    public static void Pairs(int[] arr){
        int totalPairs=0;     // tp = n(n-1)/2
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Number of possible unique pairs : "+totalPairs);
    }
    public static void main(String[] args) {
        int[] arr={12,45,90,46,34,80,67};
        Pairs(arr);
    }
}
