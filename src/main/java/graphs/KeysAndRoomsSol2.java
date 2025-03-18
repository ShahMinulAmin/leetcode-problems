package graphs;

import java.util.List;

// https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRoomsSol2 {
    int count = 0;
    boolean[] visited;
    List<List<Integer>> roomList;

    // TC: O(n*k)
    // MC: O(n+k)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        roomList = rooms;

        dfs(0);
        return roomList.size() == count;
    }

    void dfs(int keyToOpen) {
        if (visited[keyToOpen]) {
            return;
        }
        visited[keyToOpen] = true;
        count++;
        if (count == roomList.size()) {
            return;
        }

        List<Integer> keys = roomList.get(keyToOpen);
        for (Integer key : keys) {
            dfs(key);
        }
    }

}
