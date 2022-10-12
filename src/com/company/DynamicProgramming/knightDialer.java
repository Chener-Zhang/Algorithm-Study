package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class knightDialer {

    public static final int max = (int) Math.pow(10, 9) + 7;

    public int count_phone_numbers_of_given_length(Integer phone_number_length) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> arr = initNeigbor();
        long[] dp = new long[10];
        Arrays.fill(dp, 1);
        int level = phone_number_length;
        while (level > 1) {
            long[] previous = dp.clone();
            for (int i = 0; i < 10; i++) {
                //0-> 4, 6
                ArrayList<Integer> composition = arr.get(i);
                long sum = 0;
                for (int item : composition) {
                    sum += previous[item];
                }
                dp[i] = sum;
            }
            level--;
        }
        long res = 0;
        for (int i = 0; i < 10; i++) {
            res = (res + dp[i]) % max;
        }

        return (int) res;
    }

    public ArrayList<ArrayList<Integer>> initNeigbor() {
        ArrayList<ArrayList<Integer>> list_of_neighbors = new ArrayList<>();
        // 0
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(4, 6)));
        // 1
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(6, 8)));
        // 2
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(7, 9)));

        // 3
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(4, 8)));

        // 4
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(0, 3, 9)));

        // 5
        list_of_neighbors.add(new ArrayList<Integer>());

        // 6
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(0, 1, 7)));

        // 7
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(2, 6)));
        // 8
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(1, 3)));

        // 9
        list_of_neighbors.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
        return list_of_neighbors;
    }
}