package com.company;

import com.company.Problem.TwoSum;
import com.company.SortingAlgorithem.QuickSort;
import com.company.SortingAlgorithem.findKthFrequency;
import com.company.SortingAlgorithem.findKthLargest;
import com.company.SortingAlgorithem.streamMedian;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{3, 8, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        streamMedian streamMedian = new streamMedian();
        System.out.println(streamMedian.online_median(list));

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
