package com.company.DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public String lcs(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        String res = "";

        for (int row = 1; row < dp.length; row++) {
            for (int col = 1; col < dp[0].length; col++) {

                if (a.charAt(row - 1) == b.charAt(col - 1)) {
                    dp[row][col] = 1 + Math.max(dp[row][col - 1], dp[row - 1][col]);

                } else {
                    dp[row][col] = Math.max(dp[row][col - 1], dp[row - 1][col]);
                }
            }
        }

        int lcs = dp[a.length()][b.length()];
        if(lcs == 0) return "-1";
        char[] arr = new char[lcs];
        Arrays.fill(arr, ' ');
        int row = a.length();
        int col = b.length();
        while (row > 0 && col > 0) {
            if (a.charAt(row - 1) == b.charAt(col - 1)) {
                arr[lcs - 1] = a.charAt(row - 1);
                row--;
                col--;
                lcs--;
            } else if (dp[row - 1][col] > dp[row][col - 1]) {
                row--;
            } else {
                col--;
            }
        }
        printer(dp);
        String result = "";
        for (char c : arr) {
            if (c == ' ') {
                continue;
            }
            result += c;
        }
        return result;
    }

    public void printer(int[][] dp) {
        for (int[] arr : dp) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
