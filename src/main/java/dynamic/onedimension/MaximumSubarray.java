package dynamic.onedimension;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
public class MaximumSubarray {
    // TC: O(n)
    // MC: O(1)
    // Kadane's algorithm
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }


    // TC: O(n)
    // MC: O(n)
    // Dynamic bottom up; more understandable than Kadane's algorithm
    public int maxSubArrayDP(int[] nums) {
        int[] dp = nums.clone();

        int maxSum = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }
}
