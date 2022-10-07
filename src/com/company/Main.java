package com.company;

import com.company.GraphAlgorithm.minKnightMoves;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        minKnightMoves minKnightMoves = new minKnightMoves();
        System.out.println(minKnightMoves.minKnightMoves(5, 5));


    }


    static ArrayList<Integer> res;

    static ArrayList<Integer> course_schedule(Integer n, ArrayList<ArrayList<Integer>> prerequisites) {
        // Write your code here.
        LinkedList<Integer>[] edgesList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            edgesList[i] = new LinkedList();
        }

        for (ArrayList<Integer> list : prerequisites) {
            edgesList[list.get(1)].add(list.get(0));
        }

        int[] visited = new int[n];
        res = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (!dfs(edgesList, visited, i)) return new ArrayList();
        }


        return res;

    }

    static boolean dfs(LinkedList<Integer>[] edgesList, int[] visited, int start) {
        if (visited[start] == 2) return true;
        if (visited[start] == 1) return false;
        visited[start] = 1;
        for (int neighbor : edgesList[start]) {
            if (!dfs(edgesList, visited, neighbor)) return false;
        }
        visited[start] = 2;
        res.add(start);
        return true;
    }


}
