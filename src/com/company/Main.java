package com.company;


import com.company.SortingAlgorithem.MergeTwoList;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MergeTwoList MergeTwoList = new MergeTwoList();
        int[] arr = new int[]{0};
        int[] arr2 = new int[]{1};
        MergeTwoList.merge(arr, 0, arr2, 1);
        System.out.println(Arrays.toString(arr));

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
