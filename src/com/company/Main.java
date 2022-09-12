package com.company;

import com.company.Problem.TwoSum;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        TwoSum twoSum = new TwoSum();
//        System.out.println(twoSum.two_sum_unsorted(RandomNumberGenerator(20), 8).toString());
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
