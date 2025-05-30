package recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/featured/card/recursion-i/251/scenario-i-recurrence-relation/3234/
public class PascalTriangleII {

    // TC: O(n^2)
    // MC: O(n)
    public List<Integer> getRow(int rowIndex) {
        int[] prev = new int[rowIndex+1];
        int[] current = new int[rowIndex+1];
        prev[0] = current[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            prev[i] = current[i] = 1;
            for (int j = 1; j < i; j++) {
                current[j] = prev[j] + prev[j-1];
            }

            for (int j = 1; j < i; j++) {
                prev[j] = current[j];
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int j = 0; j <= rowIndex; j++) {
            resultList.add(current[j]);
        }

        return resultList;
    }

}
