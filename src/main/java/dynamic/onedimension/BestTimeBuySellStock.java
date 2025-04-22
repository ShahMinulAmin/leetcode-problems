package dynamic.onedimension;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
public class BestTimeBuySellStock {
    // TC: O(n)
    // MC: O(1)
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;
        while (sellIndex < prices.length) {
            if (prices[sellIndex] > prices[buyIndex]) {
                int profit = prices[sellIndex] - prices[buyIndex];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyIndex = sellIndex;
            }

            sellIndex++;
        }

        return maxProfit;
    }
}
