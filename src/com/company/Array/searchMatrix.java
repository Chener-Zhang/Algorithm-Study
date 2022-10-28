package com.company.Array;

public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length - 1;
        int col = 0;
        while (col >= 0 && row >= 0 && col < matrix[0].length) {
            if (target == matrix[row][col]) return true;
            else if (target < matrix[row][col]) row--;
            else if (target > matrix[row][col]) col++;
        }
        return false;
    }
}
