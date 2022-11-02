package com.company.GraphAlgorithm;

import com.company.LeetcodeProblem;

public class WordSearch implements LeetcodeProblem {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        this.visited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (!visited[row][col]) {
                    if (dfs(row, col, visited, word, board, 0)) return true;
                }

            }
        }
        return false;
    }

    public boolean dfs(int row, int col, boolean[][] visited, String st, char[][] board, int index) {
        if (row >= board.length || col >= board[0].length || row < 0 || col < 0) return false;
        if (visited[row][col]) return false;
        visited[row][col] = true;
        if (index == st.length() - 1 && st.charAt(index) == board[row][col]) return true;
        if (st.charAt(index) == board[row][col]) {
            if (dfs(row - 1, col, visited, st, board, index + 1)) return true;
            else if (dfs(row + 1, col, visited, st, board, index + 1)) return true;
            else if (dfs(row, col + 1, visited, st, board, index + 1)) return true;
            else if (dfs(row, col - 1, visited, st, board, index + 1)) return true;
        }
        visited[row][col] = false;
        return false;
    }

    @Override
    public void run() {
//        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "CS"));
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}}, "ECBA"));
    }
}
