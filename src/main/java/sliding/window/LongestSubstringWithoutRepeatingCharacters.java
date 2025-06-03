package sliding.window;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/779/
public class LongestSubstringWithoutRepeatingCharacters {
    // TC: O(n) n is the length of the string
    // MC: O(m) m is the total number of unique characters in the string
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(set.size(), maxLength);
                right++;

            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

}
