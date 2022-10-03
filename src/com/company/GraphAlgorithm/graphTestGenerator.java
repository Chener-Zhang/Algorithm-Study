package com.company.GraphAlgorithm;

import java.util.ArrayList;

public class graphTestGenerator {
    public String generateTest() {
        String s = "[\n" +
                "  [\"1\",\"1\",\"1\",\"1\",\"0\"],\n" +
                "  [\"1\",\"1\",\"0\",\"1\",\"0\"],\n" +
                "  [\"1\",\"1\",\"0\",\"0\",\"0\"],\n" +
                "  [\"0\",\"0\",\"0\",\"0\",\"0\"]\n" +
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
