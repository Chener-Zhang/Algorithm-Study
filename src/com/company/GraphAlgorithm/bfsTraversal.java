package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfsTraversal {

    public ArrayList<Integer> bfsTraversal(Integer n, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        LinkedList<Integer>[] adjacentArr = new LinkedList[n];
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacentArr[i] = new LinkedList<>();
        }
        for (ArrayList<Integer> list : edges) {
            adjacentArr[list.get(0)].add(list.get(1));
            adjacentArr[list.get(1)].add(list.get(0));
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            helper(i, adjacentArr, res, visited);
        }

        System.out.println(res.toString());
        return res;
    }

    public void helper(int start, LinkedList<Integer>[] adjacentArr, ArrayList<Integer> res, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        if (!visited[start]) {
            visited[start] = true;
            res.add(start);
        }

        while (!queue.isEmpty()) {
            int current = queue.remove();
            Iterator<Integer> iterator = adjacentArr[current].iterator();
            int tracker;
            while (iterator.hasNext()) {
                tracker = iterator.next();
                if (!visited[tracker]) {
                    res.add(tracker);
                    visited[tracker] = true;
                    queue.add(tracker);
                }
            }
        }
    }

    public void printer(LinkedList<Integer>[] adjacentArr) {
        for (LinkedList<Integer> current : adjacentArr) {
            System.out.println(current.toString());
        }

    }
}
