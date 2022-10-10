package com.company.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class rodCutting {

    public Integer get_maximum_profit(ArrayList<Integer> price) {
        // Write your code here.
        int priceLen = price.size();
        int[] arr = new int[priceLen + 1];

        for (int priceIndex = 1; priceIndex < priceLen; priceIndex++) {
            System.out.println("current priceIndex : %d " + priceIndex);
            for (int len = 1; len < arr.length; len++) {
                System.out.println(len);
                if (len >= priceIndex) {
                    arr[len] = Math.max(arr[len], price.get(priceIndex - 1) + arr[len - priceIndex]);
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr[priceLen];
    }

}
