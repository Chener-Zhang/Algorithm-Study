package com.company.GraphAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class orangesRotting {
    static int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        if (grid[0][0] == 2) {
            queue.add(new int[]{0, 0});
        }
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
                    }
                }
            }
        }
        for (int[] arr : grid) {
            for (int i : arr) {
                if (i == 1)
                    return -1;
            }
        }
        return count;
    }

    public boolean valid(int[][] grid, int row, int col) {
        if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == 1) {
            return true;
        }
        return false;
    }
}
