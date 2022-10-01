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
        for (int i = 0; i < n; i++) {
            res.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            res.get(edges.get(i).get(1)).add(edges.get(i).get(0));

        }

        for (ArrayList<Integer> pair : res) {
            Collections.sort(pair);
        }
        return res;
    }
}
