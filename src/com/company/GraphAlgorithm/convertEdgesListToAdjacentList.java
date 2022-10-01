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

    public void runner() {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(0);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(2);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(6);
        arrayList3.add(2);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(2);
        arrayList4.add(4);

        ArrayList<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(2);
        arrayList5.add(3);

        ArrayList<Integer> arrayList6 = new ArrayList<>();
        arrayList6.add(1);
        arrayList6.add(2);

//        ArrayList<Integer> arrayList7 = new ArrayList<>();
//        arrayList1.add(3);
//        arrayList1.add(4);

        edges.add(arrayList1);
        edges.add(arrayList2);
        edges.add(arrayList3);
        edges.add(arrayList4);
        edges.add(arrayList5);
        edges.add(arrayList6);
//        edges.add(arrayList7);

        convert_edge_list_to_adjacency_list(7, edges);

    }
}
