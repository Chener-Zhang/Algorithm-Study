package com.company.DynamicProgramming;

import java.util.ArrayList;

public class minPathSum {
    public int minPathSum(int[][] grid) {
        int[][] arr = new int[grid.length][grid[0].length];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            arr[0][i] = arr[0][i - 1] + grid[0][i];
        }
        for (int j = 1; j < grid.length; j++) {
            arr[j][0] = arr[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                arr[i][j] = Math.min(grid[i][j] + arr[i - 1][j], grid[i][j] + arr[i][j - 1]);
            }
        }
        return arr[grid.length - 1][grid[0].length - 1];
    }

    public Integer maximum_path_sum(ArrayList<ArrayList<Integer>> grid) {
        // Write your code here.
        int rowLength = grid.get(0).size();
        int colLength = grid.size();
        //1 2 3
        for (int i = 1; i < rowLength; i++) {
            grid.get(0).set(i, grid.get(0).get(i - 1) + grid.get(0).get(i));
        }
        for (int i = 1; i < colLength; i++) {
            grid.get(i).set(0, grid.get(i - 1).get(0) + grid.get(i).get(0));
        }
        for (int i = 1; i < colLength; i++) {
            for (int j = 1; j < rowLength; j++) {
                grid.get(i).set(j, Math.max(grid.get(i).get(j) + grid.get(i - 1).get(j), grid.get(i).get(j) + grid.get(i).get(j - 1)));
            }
        }
        return grid.get(colLength - 1).get(rowLength - 1);
    }
}
