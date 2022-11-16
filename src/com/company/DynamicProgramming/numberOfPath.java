package com.company.DynamicProgramming;

import java.util.ArrayList;

public class numberOfPath {

    public Integer number_of_paths(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.
        int[][] dp = new int[matrix.size()][matrix.get(0).size()];
        int m = matrix.size();
        int n = matrix.get(0).size();
        if (matrix.get(0).get(0) == 0) return 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 && row == 0) {
                    dp[row][col] = 1;
                } else if (matrix.get(row).get(col) == 0) {
                    dp[row][col] = 0;
                } else if (row == 0) {
                    dp[row][col] = dp[row][col - 1];
                } else if (col == 0) {
                    dp[row][col] = dp[row - 1][col];
                } else {
                    dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
