package graphs;

import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRooms {
    // TC: O(n*k)
    // MC: O(n+k)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int count = 0;
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> keyStack = new Stack<>();
        keyStack.push(0);
        count++;

        while (!keyStack.empty()) {
            Integer keyToOpen = keyStack.pop();
            visited[keyToOpen] = true;

            List<Integer> keys = rooms.get(keyToOpen);
            for (Integer key : keys) {
                if (!keyStack.contains(key) && !visited[key]) {
                    keyStack.push(key);
                    count++;
                }
            }
        }

        return rooms.size() == count;
    }

}
