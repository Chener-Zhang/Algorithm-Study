package com.company;

import com.company.SortingAlgorithem.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // write your code here
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] arr = new int[]{8, 6, 24, 1, 2, 0, 26, 19, 23, 27};
        for (int i : arr) {
            list.add(i);
        }

        System.out.println(list.toString());

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
