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
}
