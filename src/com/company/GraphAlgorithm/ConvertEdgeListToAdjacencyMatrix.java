package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertEdgeListToAdjacencyMatrix {

    public ArrayList<ArrayList<Boolean>> convert_edge_list_to_adjacency_matrix(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        boolean[][] res = new boolean[n][n];
        for (ArrayList<Integer> list : edges) {
            int row = list.get(0);
            int col = list.get(1);
            res[row][col] = true;
            res[col][row] = true;
        }

        ArrayList<ArrayList<Boolean>> results = new ArrayList<>();
        for (boolean[] row : res) {
            ArrayList<Boolean> temp = new ArrayList<>();
            for (boolean boo : row) {
                temp.add(boo);
            }
            results.add(temp);
        }
//        System.out.println(results.toString());
        return results;
    }

    public void printer(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}
