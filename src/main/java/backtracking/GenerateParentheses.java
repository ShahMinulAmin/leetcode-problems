package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    // TC: O(2^n)
    // MC: O(n)

    public List<String> resultList = new ArrayList<>();
    public Stack<Character> stack = new Stack<>();

    public List<String> generateParenthesis(int n) {
        backtrack(n, 0, 0);
        return resultList;
    }

    public void backtrack(int n, int openCount, int closeCount)  {
        if (openCount == n && closeCount == n) {
            // breaking condition
            StringBuilder sb = new StringBuilder();
            for (Character ch : stack) {
                sb.append(ch);
            }
            resultList.add(sb.toString());
        }

        if (openCount < n) {
            stack.push('(');
            backtrack(n, openCount + 1, closeCount);
            stack.pop();
        }

        if (closeCount < openCount) {
            stack.push(')');
            backtrack(n, openCount, closeCount + 1);
            stack.pop();
        }
    }

}
