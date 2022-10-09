package com.company.DynamicProgramming;

import java.util.Arrays;

public class coinChange {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, amount + 1);
        arr[0] = 0;
        for (int coin = 0; coin < coins.length; coin++) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coins[coin]) {
                    arr[i] = Math.min(arr[i], 1 + arr[i - coins[coin]]);
                }
            }
        }

        return arr[amount] > amount ? -1 : arr[amount];
    }
}
