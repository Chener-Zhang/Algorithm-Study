package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class countComponents {

    public Integer number_of_connected_components(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        LinkedList<Integer>[] adjacentList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjacentList[i] = new LinkedList<>();
        }
        for (ArrayList<Integer> list : edges) {
            adjacentList[list.get(0)].add(list.get(1));
            adjacentList[list.get(1)].add(list.get(0));
        }
        boolean[] visited = new boolean[n];
        int component = 0;
        for (int start = 0; start < n; start++) {
            if (!visited[start]) {
                component++;
                dfs(adjacentList, visited, start);
            }
        }
        return component;
    }

    public void dfs(LinkedList<Integer>[] adjacentList, boolean[] visited, int start) {
        visited[start] = true;
        for (int i : adjacentList[start]) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(adjacentList, visited, i);
            }
        }
    }

}
