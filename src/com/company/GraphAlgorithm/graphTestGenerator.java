package com.company.GraphAlgorithm;

import java.util.ArrayList;

public class graphTestGenerator {
    public String generateTest() {
        String s = "[[0,1],[0,2],[0,4],[2,3]]";
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
//        System.out.println(res.toString());
        return res;
    }


}
