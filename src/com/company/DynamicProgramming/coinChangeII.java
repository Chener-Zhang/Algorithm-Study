package com.company.DynamicProgramming;

public class coinChangeII {
    public int change(int amount, int[] coins) {
        int[] arr = new int[amount + 1];
        arr[0] = 1;

        for (int coin : coins) {
            for (int value = 1; value <= amount; value++) {
                if (value >= coin) {
                    arr[value] = arr[value] + arr[value - coin];
                }
            }
        }
        return arr[amount];
    }
}
