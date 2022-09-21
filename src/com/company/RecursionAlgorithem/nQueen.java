package com.company.RecursionAlgorithem;

import java.util.*;

public class nQueen {
    char[][] board;
    int n;
    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        //initialization
        board = boardInit(n);
        this.n = n;
        res = new ArrayList<>();

//        printer();
        solve(new ArrayList(), new ArrayList(), 0, new ArrayList());
        return res;
    }

    public void printer() {
        System.out.println();
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public List<String> addBoard() {
        List<String> temp = new ArrayList<>();
        for (char[] chars : board) {
            String string = String.valueOf(chars);
            temp.add(string);
        }
        return temp;
    }

    public void solve(List<Integer> diag, List<Integer> antiDiag, int row, List<Integer> col) {

        if (row == n) {
            res.add(addBoard());
            return;
        }

        for (int c = 0; c < board.length; c++) {
            if (!isAttack(row, c, diag, antiDiag, col)) {
                //add
                board[row][c] = 'Q';
                int currentDiag = row + c;
                int currentAntiDiag = row - c;
                diag.add(currentDiag);
                antiDiag.add(currentAntiDiag);
                col.add(c);

                solve(diag, antiDiag, row + 1, col);


                //remove
                board[row][c] = '.';
                diag.remove(diag.size() - 1);
                antiDiag.remove(antiDiag.size() - 1);
                col.remove(col.size() - 1);

            } else {
                continue;
            }
        }
    }

    public boolean isAttack(int row, int col, List<Integer> diag, List<Integer> antiDiag, List<Integer> colset) {
        if (colset.contains(col) || diag.contains(row + col) || antiDiag.contains(row - col)) {
            return true;
        }
        return false;
    }

    public char[][] boardInit(int n) {
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return board;
    }
}
