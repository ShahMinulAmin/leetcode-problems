package string.arrary;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithGreatestNumberCandies {
    // TC: O(n)
    // MC: O(n)

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int num : candies) {
            max = num > max ? num : max;
        }

        for (int num : candies) {
            if (num == max || (extraCandies + num >= max)) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }

        return result;
    }

}
