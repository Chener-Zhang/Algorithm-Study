package com.company.GraphAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class minKnightMoves {
    int[][] visited;

    public int minKnightMoves(int x, int y) {
        int[] rowArr = new int[]{-2, -2, -1, 1, -1, 1, -2, -2,};
        int[] colArr = new int[]{1, -1, 2, 2, -2, -2, 1, -1};
        visited = new int[x][];
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, 0});
        int count = 0;

        while (!queue.isEmpty()) {
            count++;
            int[] current = queue.remove();

            for (int i = 0; i < rowArr.length; i++) {
                int newRow = current[0] + rowArr[i];
                int newCol = current[1] + colArr[i];

                if (isValid(newRow, newCol, x, y)) {
                    if (newRow == x && newCol == y) return count;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
        return -1;

    }

    public boolean isValid(int row, int col, int xSize, int ySize) {
        return row > 0 && col > 0 && visited[row][col] != 1;
    }
}
