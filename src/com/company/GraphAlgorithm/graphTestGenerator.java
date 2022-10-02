package com.company.GraphAlgorithm;

import java.util.ArrayList;

public class graphTestGenerator {
    public String generateTest() {
        String s = "[\n" +
                "[0, 1],\n" +
                "[0, 2],\n" +
                "[1, 4],\n" +
                "[3, 5]\n" +
                "]";
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
