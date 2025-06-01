package two.pointers;

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

}
