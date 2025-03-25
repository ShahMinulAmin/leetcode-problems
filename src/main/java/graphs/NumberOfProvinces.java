package graphs;

// https://leetcode.com/problems/number-of-provinces/
public class NumberOfProvinces {
    // TC: O(n^2)
    // MC: O(n)
    public int findCircleNum(int[][] isConnected) {
        int numNodes = isConnected.length;
        boolean[] visited = new boolean[numNodes];
        int numComponents = 0;

        for (int i = 0; i < numNodes; i++) {
            if (!visited[i]) {
                numComponents++;
                dfs(i, isConnected, visited);
            }
        }

        return numComponents;
    }

    void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true;
        for (int j = 0; j < isConnected[node].length; j++) {
            if (isConnected[node][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }

}
