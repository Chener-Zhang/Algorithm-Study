package com.company.DynamicProgramming;

import com.company.LeetcodeProblem;

public class zeroOneUpdateMatrix implements LeetcodeProblem {
    public int[][] updateMatrix(int[][] mat) {
        int[][] arr = new int[mat.length][mat[0].length];
        //First scan
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    arr[i][j] = 0;
                } else {
                    if (i > 0 && j > 0) {
                        arr[i][j] = 1 + Math.min(arr[i - 1][j], arr[i][j - 1]);
                    } else if (i > 0) {
                        arr[i][j] = 1 + arr[i - 1][j];
                    } else {
                        arr[i][j] = 1 + arr[i][j - 1];
                    }
                }
            }
        }
        //Second scan
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[0].length - 1; j >= 0; j--) {
//                System.out.println(" i = " + i + "j = " + j + "\n");
                if (mat[i][j] == 0) {
                    arr[i][j] = 0;
                } else {
                    if (i < mat.length - 1 && j < mat[0].length - 1) {
                        arr[i][j] = 1 + Math.min(arr[i + 1][j], arr[i][j + 1]);
                    } else if (i < mat.length - 1) {
                        arr[i][j] = 1 + arr[i + 1][j];
                    } else {
                        arr[i][j] = 1 + arr[i][j + 1];
                    }
                }
            }
        }
        return arr;
    }

    @Override
    public void run() {
        updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}});
    }
}
