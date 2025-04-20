package string.arrary;

// https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSubsequence {

    // TC: O(n)
    // MC: O(1)
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        // first min, second min, third min approach
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min1) {
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            } else {
                return true;
            }
        }

        return false;
    }

}
