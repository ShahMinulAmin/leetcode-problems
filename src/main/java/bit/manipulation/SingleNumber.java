package bit.manipulation;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    // TC: O(n)
    // MC: O(1)
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }

        return sum;
    }
}
