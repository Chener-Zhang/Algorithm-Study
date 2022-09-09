package com.company;

import com.company.SortingAlgorithem.MergeSort;
import com.company.SortingAlgorithem.QuickSort;

import java.util.ArrayList;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Defind Sort method
//        QuickSort quickSort = new QuickSort();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int[] arr = new int[]{5, 8, 3, 9, 4, 1, 7};
//        for (int i : arr) {
//            list.add(i);
//        }
//        quickSort.sort(list, 0, list.size() - 1);
//        System.out.println(list.toString());
        RandomNumberGenerator(20);
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
