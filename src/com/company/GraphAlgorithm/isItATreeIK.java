package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class isItATreeIK {


    public Boolean is_it_a_tree(Integer node_count, ArrayList<Integer> edge_start, ArrayList<Integer> edge_end) {
        // Write your code here.
        LinkedList<Integer>[] adjacentList = new LinkedList[node_count];
        for (int i = 0; i < node_count; i++) {
            adjacentList[i] = new LinkedList();
        }
        for (int i = 0; i < edge_start.size(); i++) {
            adjacentList[edge_start.get(i)].add(edge_end.get(i));
            adjacentList[edge_end.get(i)].add(edge_start.get(i));
        }
        boolean[] visited = new boolean[node_count];
        boolean res = noCycle(0, -1, adjacentList, visited);
        for (boolean boo : visited) {
            if (boo == false) {
                return false;
            }
        }
        return res;
    }

    public boolean noCycle(int node, int parent, LinkedList<Integer>[] adjacentList, boolean[] visited) {
        if (visited[node]) return false;
        visited[node] = true;
        for (int i : adjacentList[node]) {
            if (i != parent) {
                boolean result = noCycle(i, node, adjacentList, visited);
                if (!result) return false;
            }
        }
        return true;
    }


}
