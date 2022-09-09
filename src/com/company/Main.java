package com.company;

import com.company.SortingAlgorithem.MergeSort;
import com.company.SortingAlgorithem.QuickSort;

import java.util.ArrayList;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RandomNumberGenerator(15);
        int[] arr = new int[]{4, 13, 13, 6, 4, 0, 5, 8, 7, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
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
