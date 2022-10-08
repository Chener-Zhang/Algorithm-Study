package com.company.DynamicProgramming;

import java.util.Arrays;

public class fibonacciNumber {
    public int fib(int n) {
        if(n<=1) return n;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
