package com.company.DynamicProgramming;

public class nChooseR {
    public Integer ncr(Integer n, Integer r) {
        // Write your code here.
        if (n == r) return 1;
        if (r > n) return 0;
        int[] previous = new int[n + 1];
        previous[0] = 1;
        int count = n;
        while (count > 0) {
            int[] current = new int[n + 1];
            current[0] = 1;
            for (int i = 1; i < n; i++) {
                current[i] = previous[i - 1] + previous[i];
            }
            previous = current;
            count--;
        }


        return previous[r];

    }

}
