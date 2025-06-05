package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    // TC: O(n)
    // MC: O(n)
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                ')', '(',
                '}', '{',
                ']', '[');

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top =  stack.pop();
                if (map.get(ch) != top) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

}
