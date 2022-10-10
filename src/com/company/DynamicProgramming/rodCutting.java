package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class rodCutting {

    public Integer get_maximum_profit(ArrayList<Integer> price) {
        // Write your code here.
        int len = price.size();
        int[] arr = new int[len + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += price.get(0) * i;
        }
        for (int priceIndex = 1; priceIndex < len; priceIndex++) {
            for (int i = 1; i <= len; i++) {
                System.out.printf("current price  = %d current len = %d\n", price.get(priceIndex), i);
                if (i >= priceIndex) {
                    int previous = price.get(priceIndex);
                    int current = arr[i - priceIndex];
                    arr[i] = Math.max(arr[i], previous + current);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

}
