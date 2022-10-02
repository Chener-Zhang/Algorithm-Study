package com.company;

import com.company.GraphAlgorithm.dfsTraversal;
import com.company.GraphAlgorithm.graphTestGenerator;

public class Main {

    public static void main(String[] args) {
        graphTestGenerator generateTest = new graphTestGenerator();

        dfsTraversal dfsTraversal = new dfsTraversal();
        dfsTraversal.dfs_traversal(6, generateTest.toArrayList(new int[][]{
                {0, 1},
                {0, 2},
                {1, 4},
                {3, 5}
        }));
    }


}
