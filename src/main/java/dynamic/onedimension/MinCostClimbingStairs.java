package dynamic.onedimension;

// https://leetcode.com/problems/min-cost-climbing-stairs
public class MinCostClimbingStairs {
    // TC: O(n)
    // MC: O(n)
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 2];
        dp[n] = 0;
        dp[n + 1] = 0;

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0], dp[1]);
    }
}
