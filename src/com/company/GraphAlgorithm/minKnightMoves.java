package com.company.GraphAlgorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class minKnightMoves {
    int[][] visited;
    int xSize;
    int ySize;
    private final int[][] DIRECTIONS = new int[][]{{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    public int minKnightMoves(int x, int y) {

        xSize = x + 5;
        ySize = y + 5;

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, 0});

        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.remove();
                if (current[0] == x && current[1] == y) return count;

                for (int k = 0; k < DIRECTIONS.length; k++) {
                    int newRow = current[0] + DIRECTIONS[k][0];
                    int newCol = current[1] + DIRECTIONS[k][1];
                    if (!visited.contains(newRow + "," + newCol) && newRow >= 0 && newCol >= 0) {
                        queue.add(new int[]{newRow, newCol});
                        visited.add(newRow + "," + newCol);
                    }
                }
            }
            count++;
        }
        return -1;

    }
}
