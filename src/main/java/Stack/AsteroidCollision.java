package Stack;

import java.util.Stack;

// https://leetcode.com/problems/asteroid-collision
public class AsteroidCollision {
    // TC: O(n)
    // MC: O(n)
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int ast : asteroids) {
            boolean survive = true;
            while (!stack.empty() && stack.peek() > 0 && ast < 0) {
                if (stack.peek() < -ast) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -ast) {
                    stack.pop();
                }
                survive = false;
                break;
            }
            if (survive) {
                stack.push(ast);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;
        for (Integer item : stack) {
            result[index++] = item;
        }

        return result;
    }
}
