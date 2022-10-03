package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class bfsTraversal {
    ArrayList<Integer> res;

    public ArrayList<Integer> bfsTraversal(Integer n, ArrayList<ArrayList<Integer>> edges) {
        //Result init
        res = new ArrayList<>();
        // Write your code here.
        LinkedList<Integer>[] edgesList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            edgesList[i] = new LinkedList();
        }

        for (ArrayList<Integer> arr : edges) {
            edgesList[arr.get(0)].add(arr.get(1));
            edgesList[arr.get(1)].add(arr.get(0));
        }
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(visited, i, edgesList);
            }
        }
        System.out.println(res.toString());
        return res;
    }

    public void bfs(boolean[] visited, int start, LinkedList<Integer>[] edgesList) {
        Stack<Integer> stack = new Stack();
        stack.push(start);
        visited[start] = true;
        res.add(start);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int i : edgesList[current]) {
                if (!visited[i]) {
                    stack.add(i);
                    visited[i] = true;
                    res.add(i);
                }
            }
        }
    }


}
