package sliding.window;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/fruit-into-baskets/
public class FruitIntoBaskets {
    // TC: O(n)
    // MC: O(1)
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, total = 0, maxTotal = 0;

        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            right++;
            total++;

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
                total--;
            }

            maxTotal = Math.max(total, maxTotal);
        }

        return maxTotal;
    }

}
