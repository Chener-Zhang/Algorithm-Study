package com.company.GraphAlgorithm;

import java.util.ArrayList;

public class numIslands {
    public int numIslands(char[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int numberIsland = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == '1') {
                    numberIsland++;
                    dfs(row, col, grid);
                }
            }
        }

//        System.out.println(numberIsland);
        return numberIsland;
    }

    public void dfs(int row, int col, char[][] grid) {
        //check edge case
        if (row < 0 || col < 0 || row == grid.length || col == grid[0].length || grid[row][col] == '0') return;
        grid[row][col] = '0';
        dfs(row - 1, col, grid);
        dfs(row + 1, col, grid);
        dfs(row, col - 1, grid);
        dfs(row, col + 1, grid);
    }




}
