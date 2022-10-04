package com.company.GraphAlgorithm;

import java.util.*;

public class isItATreeIK {

    public boolean validTree(int n, int[][] edges) {
        LinkedList<Integer>[] edgesList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            edgesList[i] = new LinkedList();
        }
        for (int[] arr : edges) {
            edgesList[arr[0]].add(arr[1]);
            edgesList[arr[1]].add(arr[0]);
        }
        Map<Integer, Integer> parents = new HashMap();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);
        parents.put(0, -1);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int i : edgesList[current]) {

                if (i == parents.get(current)) {
                    continue;
                }
                if (parents.containsKey(i)) {
                    return false;
                }
                stack.add(i);
                parents.put(i, current);
            }
        }
        return parents.size() == n;
    }

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
