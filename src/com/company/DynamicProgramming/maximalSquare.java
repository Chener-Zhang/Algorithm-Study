package com.company.DynamicProgramming;

public class maximalSquare {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1]));
                }
            }
        }
        int last = dp[matrix.length - 1][matrix[0].length - 1];
        return last * last;
    }
}
