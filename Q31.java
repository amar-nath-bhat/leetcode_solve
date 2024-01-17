// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution31 {
    public static int maxProfit(int[] prices) {
        int buy = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                continue;
            }
            if (maxProfit < prices[i] - buy) {
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }
}

public class Q31 {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 3, 1 };
        System.out.println(Solution31.maxProfit(arr));
    }
}
