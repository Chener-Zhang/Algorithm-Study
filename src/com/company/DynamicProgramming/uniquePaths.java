package com.company.DynamicProgramming;

import java.util.Arrays;

public class uniquePaths {
    public int uniquePaths(int m, int n) {
        int[] previous = new int[m];
        Arrays.fill(previous, 1);
        int level = n - 1;

        while (level > 0) {
            int[] current = new int[m];
            current[0] = 1;
            for (int i = 1; i < m; i++) {
                current[i] = previous[i] + current[i - 1];
            }
            previous = current;
            level--;
        }
        return previous[m - 1];
    }
}
