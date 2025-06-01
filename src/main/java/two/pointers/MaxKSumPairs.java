package two.pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75
public class MaxKSumPairs {
    // TC: O(n)
    // MC: O(n)
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int totalCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int remain = k - nums[i];
            if (map.containsKey(remain)) {
                totalCount++;
                if (map.get(remain) == 1) {
                    map.remove(remain);
                } else {
                    map.put(remain, map.get(remain) - 1);
                }

            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        return totalCount;
    }


    // using two pointers
    // TC: O(nlogn)
    // MC: O(1)
    public int maxOperationsV2(int[] nums, int k) {
        Arrays.sort(nums);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int count = 0;

        while (leftIndex < rightIndex) {
            int sum = nums[leftIndex] + nums[rightIndex];
            if (sum == k) {
                count++;
                leftIndex++;
                rightIndex--;
            } else if (sum > k) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

        return count;
    }


}
