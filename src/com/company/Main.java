package com.company;

import com.company.RecursionAlgorithem.Combination;
import com.company.RecursionAlgorithem.Permutation;
import com.company.RecursionAlgorithem.generateBinary;
import com.company.RecursionAlgorithem.subSet;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        subSet subSet = new subSet();
        subSet.subsets(new int[]{1, 2, 3});
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
