package com.company;

import com.company.GraphAlgorithm.numIslands;

public class Main {

    public static void main(String[] args) {
        numIslands numIslands = new numIslands();

        numIslands.numIslands(new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '1', '0'}
                }
        );

    }


}
