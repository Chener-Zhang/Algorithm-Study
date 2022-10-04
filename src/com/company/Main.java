package com.company;

import com.company.GraphAlgorithm.graphTestGenerator;
import com.company.GraphAlgorithm.isItATreeIK;

public class Main {

    public static void main(String[] args) {
        isItATreeIK isItATreeIK = new isItATreeIK();
        graphTestGenerator graphTestGenerator = new graphTestGenerator();
//        graphTestGenerator.generateTest();
        isItATreeIK.validTree(5,new int[][]{{0,1},{0,2},{0,3},{1,4}});
    }


}
