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

    public void runner() {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0);
        arrayList1.add(1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(4);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(3);

        ArrayList<Integer> arrayList5 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(4);
        edges.add(arrayList1);
        edges.add(arrayList2);
        edges.add(arrayList3);
        edges.add(arrayList4);
        edges.add(arrayList5);

        convert_edge_list_to_adjacency_list(5, edges);

    }
}
