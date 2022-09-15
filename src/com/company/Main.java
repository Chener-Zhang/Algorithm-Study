package com.company;

import com.company.Problem.findIntersection;
import com.company.Problem.fourSumTraditional;

import java.util.ArrayList;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        fourSumTraditional fourSumTraditional = new fourSumTraditional();
        int[] arr = new int[]{1000000000, 1000000000, 1000000000, 1000000000
                - 294967296};
        fourSumTraditional.fourSumTraditional(arr, -294967296);
    }

    public static ArrayList<Integer> toArrayList(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : arr) {
            res.add(i);
        }
        return res;
    }

    public static ArrayList<Integer> RandomNumberGenerator(int upperbound) {
        Random random = new Random();
        int upperBound = upperbound;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(upperBound));
        }
        System.out.println(arrayList.toString());
        return arrayList;
    }
}
