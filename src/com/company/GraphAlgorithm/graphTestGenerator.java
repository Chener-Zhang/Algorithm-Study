package com.company.GraphAlgorithm;

import java.util.ArrayList;

public class graphTestGenerator {
    public String generateTest() {
        String s = "[[0,1], [1,4], [1,2], [1,3],[3,4]]";
        s = s.replace("[", "{");
        s = s.replace("]", "}");
        System.out.println(s);

        return s;
    }

    public ArrayList<ArrayList<Integer>> toArrayList(int[][] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int[] list : arr) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : list) {
                temp.add(i);
            }
            res.add(temp);
        }
        System.out.println(res.toString());
        return res;
    }


}
