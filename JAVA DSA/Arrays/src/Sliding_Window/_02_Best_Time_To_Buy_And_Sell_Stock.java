package Sliding_Window;
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//   LC 121  ---- O(n)
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class _02_Best_Time_To_Buy_And_Sell_Stock {
    public static int Max_Profit(int[] arr){
       int max_profit=0;
       int best_price_to_buy=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(best_price_to_buy < arr[i]){    //  assuming today is the
                // sell day -- if I have bought that stock on that day and I am selling it today then check if there
                // is a profit or loss....
                max_profit=Math.max(max_profit,(arr[i]-best_price_to_buy));
            }
                  // finding the best price to buy the stock --- the min possible rice is the best day to buy stock
            // till now... the current day
                 best_price_to_buy=Math.min(arr[i],best_price_to_buy);


        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(Max_Profit(arr));

    }

}
