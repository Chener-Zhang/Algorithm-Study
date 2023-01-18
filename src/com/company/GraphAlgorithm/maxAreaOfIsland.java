package com.company.GraphAlgorithm;

import com.company.LeetcodeProblem;

public class maxAreaOfIsland implements LeetcodeProblem {
    public int maxAreaOfIsland(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int max = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == 1) {

                    max = Math.max(max, dfs(row, col, grid));
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public int dfs(int row, int col, int[][] grid) {
        if (row < 0 || col < 0 || row == grid.length || col == grid[0].length || grid[row][col] == 0) return 0;
        grid[row][col] = 0;
        return 1 + dfs(row - 1, col, grid) + dfs(row + 1, col, grid) + dfs(row, col - 1, grid) + dfs(row, col + 1, grid);
    }



    @Override
    public void run() {
        maxAreaOfIsland(new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}});
//        maxAreaOfIsland(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}});
    }
}
