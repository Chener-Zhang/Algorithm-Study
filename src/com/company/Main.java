package com.company;


import com.company.Problem.fourSum;
import com.company.Problem.fourSumTraditional;
import com.company.SortingAlgorithem.MergeTwoList;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        fourSumTraditional fourSumTraditional = new fourSumTraditional();
        int[] arr = new int[]{1, 5, 2, 3, 8, 4, 6, 7};

        System.out.println(fourSumTraditional.fourSumTraditional(arr, 15).toString());

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
