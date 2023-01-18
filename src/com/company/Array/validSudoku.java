package com.company.Array;

import com.company.LeetcodeProblem;

import java.util.HashSet;

public class validSudoku implements LeetcodeProblem {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] area = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            area[i] = new HashSet<Character>();

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int areaCode = (i / 3) * 3 + (j / 3);

                    if (row[i].contains(board[i][j]) || col[j].contains(board[i][j]) || area[areaCode].contains(board[i][j])) {
                        return false;
                    }
                    row[i].add((board[i][j]));
                    col[j].add((board[i][j]));
                    area[areaCode].add((board[i][j]));
                }
            }
        }

        return true;
    }

    @Override
    public void run() {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        boolean result = isValidSudoku(board);
        System.out.println(result);
    }
}
