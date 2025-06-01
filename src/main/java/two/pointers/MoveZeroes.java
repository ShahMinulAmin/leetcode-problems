package two.pointers;

// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
public class MoveZeroes {
    // TC: O(n)
    // MC: O(1)
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            } else {
                countZero++;
            }
        }

        while (countZero > 0) {
            nums[index++] = 0;
            countZero--;
        }
    }
}
