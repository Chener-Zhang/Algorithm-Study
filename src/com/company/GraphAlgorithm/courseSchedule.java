package com.company.GraphAlgorithm;

import java.util.LinkedList;

public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        LinkedList<Integer>[] edges = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges[i] = new LinkedList<>();
        }
        for (int[] arr : prerequisites) {
            edges[arr[0]].add(arr[1]);
        }
        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {

            if (!dfs(i, visited, edges))
                return false;
        }
        return true;

    }

    public boolean dfs(int node, int[] visited, LinkedList<Integer>[] edges) {

        if (visited[node] == 1) {
            return false;
        }

        if (visited[node] == 2) {
            return true;
        }

        visited[node] = 1;

        for (int n : edges[node]) {
            if (!dfs(n, visited, edges))
                return false;
        }


        visited[node] = 2;

        return true;
    }
}
