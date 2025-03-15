package Stack;

import java.util.Stack;

// https://leetcode.com/problems/removing-stars-from-a-string/
public class RemovingStarsFromString {
    // TC: O(n)
    // MC: O(n)
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
