package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class dfsTraversal {
    public ArrayList<Integer> dfs_traversal(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        LinkedList<Integer> edgesList[] = new LinkedList[n];
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            edgesList[i] = new LinkedList<>();
        }
        for (ArrayList<Integer> list : edges) {
            edgesList[list.get(0)].add(list.get(1));
            edgesList[list.get(1)].add(list.get(0));
        }

        for (int i = 0; i < n; i++) {
            helper(i, edgesList, res, visited);
        }

        return res;
    }

    public void helper(int start, LinkedList<Integer>[] edgesList, ArrayList<Integer> res, boolean[] visited) {
        if (!visited[start]) {
            visited[start] = true;
            res.add(start);
        } else {
            return;
        }
        for (int i : edgesList[start]) {
            helper(i, edgesList, res, visited);
        }
    }

    public void printer(LinkedList<Integer>[] adjacentArr) {
        for (LinkedList<Integer> current : adjacentArr) {
            System.out.println(current.toString());
        }

    }
}
