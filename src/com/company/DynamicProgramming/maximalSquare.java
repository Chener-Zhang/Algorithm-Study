package com.company.DynamicProgramming;

public class maximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = m > 0 ? matrix[0].length : 0;
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (matrix[row - 1][col - 1] == '1') {
                    dp[row][col] = Math.min(Math.min(dp[row - 1][col], dp[row][col - 1]), dp[row - 1][col - 1]) + 1;
                    max = Math.max(max, dp[row][col]);
                }
            }
        }

        return max * max;
    }
}
