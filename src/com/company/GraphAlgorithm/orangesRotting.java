package com.company.GraphAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class orangesRotting {
    static int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int fresh;

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int count = -1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            count++;
            for (int i = 0; i < len; i++) {
                int[] current = queue.remove();
                for (int k = 0; k < directions.length; k++) {
                    int newRow = current[0] + directions[k][0];
                    int newCol = current[1] + directions[k][1];
                    if (valid(grid, newRow, newCol)) {
                        queue.add(new int[]{newRow, newCol});
                        grid[newRow][newCol] = 2;
                        fresh--;
                    }
                }
            }
        }

        return fresh == 0 ? count : -1;
    }

    public boolean valid(int[][] grid, int row, int col) {
        if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == 1) {
            return true;
        }
        return false;
    }
}
