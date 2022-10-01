package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class convertEdgesListToAdjacentList {

    public ArrayList<ArrayList<Integer>> convert_edge_list_to_adjacency_list(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList());
        }
        for (ArrayList<Integer> pair : edges) {
            int first = pair.get(0);
            int second = pair.get(1);
            res.get(first).add(second);
            res.get(second).add(first);
        }
        for (ArrayList<Integer> pair : res) {
            Collections.sort(pair);
        }
        System.out.println(res.toString());
        return res;
    }


}
