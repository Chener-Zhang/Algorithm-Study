package com.company.DynamicProgramming;

import java.util.Collections;
import java.util.List;

public class triangleSum {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int row = 1; row < size; row++) {
            for (int col = 0; col <= row; col++) {

                if (col == 0) {
                    triangle.get(row).set(0, triangle.get(row - 1).get(0) + triangle.get(row).get(0));
                } else if (col == row) {
                    triangle.get(row).set(col, triangle.get(row - 1).get(col - 1) + triangle.get(row).get(col));
                } else {
                    triangle.get(row).set(col, Math.min(triangle.get(row).get(col) + triangle.get(row - 1).get(col - 1), triangle.get(row).get(col) + triangle.get(row - 1).get(col)));
                }
            }
        }
        System.out.println(triangle.toString());
        Collections.sort(triangle.get(size - 1));
        return triangle.get(size - 1).get(0);
    }
}
