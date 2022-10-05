package com.company;

import com.company.GraphAlgorithm.FloodFill;

public class Main {

    public static void main(String[] args) {

        FloodFill FloodFill = new FloodFill();
        FloodFill.floodFill(new int[][]{{0,2,1}, {1, 1, 2}, {2, 5,4}}, 1, 0, 9);

    }


}
