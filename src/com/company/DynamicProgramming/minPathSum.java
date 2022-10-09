package com.company.DynamicProgramming;

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
//        System.out.println(arr[grid.length - 1][grid[0].length - 1]);
        return arr[grid.length - 1][grid[0].length - 1];
    }
}
