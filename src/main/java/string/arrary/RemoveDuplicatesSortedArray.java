package string.arrary;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
public class RemoveDuplicatesSortedArray {
    // TC: O(n)
    // MC: O(1)
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)  {
            return 1;
        }

        int oldIndex = 1;
        int newIndex = 0;
        for ( ; oldIndex < nums.length; oldIndex++)  {
            if (nums[oldIndex] == nums[newIndex]) {
                continue;
            } else {
                newIndex = newIndex + 1;
                nums[newIndex] = nums[oldIndex];
            }
        }

        return newIndex + 1;
    }
}
