package com.company.GraphAlgorithm;

import java.util.*;

public class possibleBipartition {
    public Boolean can_be_divided(Integer num_of_people, ArrayList<Integer> dislike1, ArrayList<Integer> dislike2) {
        // Write your code here.
        LinkedList<Integer>[] edgeList = new LinkedList[num_of_people];
        int[] flags = new int[num_of_people];
        Arrays.fill(flags, -1);

        for (int i = 0; i < num_of_people; i++) {
            edgeList[i] = new LinkedList();
        }
        for (int i = 0; i < dislike1.size(); i++) {
            edgeList[dislike1.get(i)].add(dislike2.get(i));
            edgeList[dislike2.get(i)].add(dislike1.get(i));
        }
        printer(edgeList);

        boolean res = true;
        for (int i = 0; i < num_of_people; i++) {
            if (flags[i] != -1) continue;
            flags[i] = 0;
            res &= bfs(edgeList, i, flags);
        }
        System.out.println(res);
        return res;
    }

    public boolean bfs(LinkedList<Integer>[] edgeList, int start, int[] flags) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            int currentFlag = flags[current];

            for (int i : edgeList[current]) {
                if (flags[i] != -1) {
                    if (flags[i] == currentFlag) return false;
                } else {
                    flags[i] = 1 - currentFlag;
                    queue.add(i);
                }
            }
        }
        return true;
    }


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
