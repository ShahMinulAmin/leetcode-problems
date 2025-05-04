package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/795/
public class Permutations {
    // TC: O(n! * n^2)
    // TC: O(n! * n)
    public List<List<Integer>> permute(int[] nums) {
        // base case
        if (nums.length == 0) {
            return List.of(new ArrayList<>());
        }

        List<List<Integer>> permutations = permute(Arrays.copyOfRange(nums, 1, nums.length));
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            for (int i = 0; i <= permutation.size(); i++) {
                // deep copy
                List<Integer> permutationCopy = new ArrayList<>(permutation);
                permutationCopy.add(i, nums[0]);
                result.add(permutationCopy);
            }
        }

        return result;
    }

}
