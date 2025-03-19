package graphs;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/nearest-exit-from-entrance-in-maze
public class NearestExitEntranceMaze {

    // TC: O(n*m)
    // TC: O(n*m)
    public int nearestExit(char[][] maze, int[] entrance) {
        int numberOfColumns = maze.length;
        int numberOfRows = maze[0].length;
        int[][] cost = new int[numberOfColumns][numberOfRows];
        int[][] possibleMoves = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);

        int minCost = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int curX = cell[0];
            int curY = cell[1];

            for (int[] move : possibleMoves) {
                int nextX = curX + move[0];
                int nextY = curY + move[1];

                if (nextX < 0 || nextX >= numberOfColumns
                        || nextY < 0 || nextY >= numberOfRows) {
                    continue;
                }

                if (nextX == entrance[0] && nextY == entrance[1]) {
                    continue;
                }

                if (maze[nextX][nextY] == '.' && cost[nextX][nextY] == 0) {
                    queue.add(new int[]{nextX, nextY});
                    cost[nextX][nextY] = 1 + cost[curX][curY];

                    if ((nextX == 0 || nextX == numberOfColumns-1)
                            || (nextY == 0 || nextY == numberOfRows-1)) {
                        minCost = Math.min(minCost, cost[nextX][nextY]);
                    }
                }
            }
        }

        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

}
