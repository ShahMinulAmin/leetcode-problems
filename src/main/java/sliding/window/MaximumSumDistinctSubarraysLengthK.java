package sliding.window;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
public class MaximumSumDistinctSubarraysLengthK {
    // TC: O(n)
    // MC: O(n)
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        long currentSum = 0, maxSum = 0;

        while (right < nums.length) {
            currentSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                currentSum -= nums[left];
                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(currentSum, maxSum);
            }

            right++;
        }

        return maxSum;
    }
}
