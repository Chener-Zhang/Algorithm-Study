package com.company;

import com.company.GraphAlgorithm.ConvertEdgeListToAdjacencyMatrix;
import com.company.GraphAlgorithm.graphTestGenerator;


public class Main {

    public static void main(String[] args) {

        graphTestGenerator graphTestGenerator = new graphTestGenerator();

        ConvertEdgeListToAdjacencyMatrix ConvertEdgeListToAdjacencyMatrix = new ConvertEdgeListToAdjacencyMatrix();
        ConvertEdgeListToAdjacencyMatrix.convert_edge_list_to_adjacency_matrix(5,graphTestGenerator.toArrayList(new int[][]{{0, 1}, {1, 4}, {1, 2}, {1, 3}, {3, 4}}));
    }


}
