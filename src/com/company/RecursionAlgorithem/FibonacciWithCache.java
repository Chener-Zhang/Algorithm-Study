package com.company.RecursionAlgorithem;

public class FibonacciWithCache {
    public Integer find_fibonacci(Integer n) {
        // Write your code here.
        int[] cache = new int[n + 1];
        return helper(n, cache);

    }

    public Integer helper(Integer n, int[] cache) {

        if (cache[n] != 0) {
            return cache[n];
        } else {
            if (n == 1 || n == 0) return n;
            Integer results = helper(n - 1, cache) + helper(n - 2, cache);
            cache[n] = results;
            return results;
        }
    }

}
