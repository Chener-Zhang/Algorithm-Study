package com.company.Array;

import com.company.LeetcodeProblem;

public class setZeroes implements LeetcodeProblem {
    public void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }

    @Override
    public void run() {

        setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
//        setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
//        setZeroes(new int[][]{{1, 2, 3, 4}, {5, 0, 7, 8}, {0, 10, 11, 12}, {13, 14, 15, 0}});
//        setZeroes(new int[][]{{1, 0, 3}});
    }

}
