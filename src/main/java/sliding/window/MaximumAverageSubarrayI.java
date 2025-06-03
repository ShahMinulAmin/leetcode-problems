package sliding.window;

// https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75
public class MaximumAverageSubarrayI {
    // TC: O(n)
    // MC: O(1)
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        int startLimit = nums.length - k;
        int start = 1, end = 0;
        while (start <= startLimit) {
            end = start + k - 1;
            currentSum = currentSum - nums[start-1] + nums[end];
            maxSum = Math.max(currentSum, maxSum);
            start++;
        }

        return (double) maxSum / k;
    }

}
