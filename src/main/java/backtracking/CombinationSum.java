package backtracking;

import java.util.*;

// https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {

    public static void main(String args[]) {
        CombinationSum sum = new CombinationSum();

        //sum.combinationSum(new int[]{2,3,6,7}, 7);
        sum.combinationSum(new int[]{8,10,9,32,25,27,22,38,15,5,3,26,30,11,21,36,37}, 39);
    }

    // TC: O(2^n)
    // MC: O(t/d) where t is the target and d is the smallest candidate, representing the depth of the recursion
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> resultList = new HashSet<>();
        List<Integer> currList = new ArrayList<>();
        gererate(candidates, target, 0, 0, currList, resultList);
        return new ArrayList<>(resultList);
    }


    public void gererate(int[] candidates,
                         int target,
                         int sumSoFar,
                         int index,
                         List<Integer> currentList,
                         Set<List<Integer>> resultList) {
        // stopping condition
        if (sumSoFar == target) {
            resultList.add(new ArrayList<>(currentList)); // deep copy **
            return;
        }

        if (index >= candidates.length || sumSoFar > target) {
            return;
        }

        currentList.add(candidates[index]);
        gererate(candidates, target, sumSoFar + candidates[index],
                index, currentList, resultList);

        currentList.remove(currentList.size() - 1);
        gererate(candidates, target, sumSoFar,
                index + 1, currentList, resultList);

    }

}
