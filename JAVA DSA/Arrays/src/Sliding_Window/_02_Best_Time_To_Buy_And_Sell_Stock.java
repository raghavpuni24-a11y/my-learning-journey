package Sliding_Window;

public class _02_Best_Time_To_Buy_And_Sell_Stock {
    public static int Max_Profit(int[] arr){
        int max_profit=0;
        int buy=0, sell=1;
        for (int i = 0; i < arr.length-1; i++) {  // buy day = i
            for (int j = i+1; j < arr.length; j++) { // sell
                if(arr[j]-arr[i] > max_profit ) max_profit =  arr[j]-arr[i];
            }
        }
        return max_profit;

    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(Max_Profit(arr));

    }

}
