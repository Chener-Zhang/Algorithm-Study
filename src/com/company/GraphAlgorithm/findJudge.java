package com.company.GraphAlgorithm;

import java.util.LinkedList;

public class findJudge {
    public int findJudge(int n, int[][] trust) {
        int[] counter = new int[n+1];

        for(int[] arr : trust){
            counter[arr[0]] --;
            counter[arr[1]] ++;
        }
        for(int i = 1; i <=n ; i ++){
            if(counter[i] == n - 1) return i;
        }
        return - 1;
    }
}
