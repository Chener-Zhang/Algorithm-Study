package com.company.GraphAlgorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class possibleBipartition {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer>[] edgesList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            edgesList[i] = new LinkedList<>();
        }
        for (int[] arr : dislikes) {
            int v = arr[0] - 1;
            int e = arr[1] - 1;
            edgesList[v].add(e);
            edgesList[e].add(v);
        }
        boolean res = true;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i)) continue;
            map.put(i, 0);
            res &= bfs(map, edgesList, i);
        }
        return res;
    }

    public boolean bfs(Map<Integer, Integer> map, LinkedList<Integer>[] edgesList, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            int currentFlag = map.get(current);
            for (int edge : edgesList[current]) {
                if (map.containsKey(edge)) {
                    if (currentFlag == map.get(edge)) return false;
                    else continue;
                } else {
                    map.put(edge, 1 - currentFlag);
                    queue.add(edge);
                }
            }
        }
        return true;
    }

    public void printer(LinkedList<Integer>[] edgesList) {
        for (LinkedList<Integer> current : edgesList) {
            System.out.println(current.toString());
        }

    }
}
