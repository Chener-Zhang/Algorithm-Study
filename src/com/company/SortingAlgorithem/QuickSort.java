package com.company.SortingAlgorithem;

import java.util.ArrayList;

public class QuickSort {
    public void sort(ArrayList<Integer> list, int low, int high) {

        if (low >= high) {
            return;
        }
        int pivot = partition(list, low, high);
        sort(list, low, pivot);
        sort(list, pivot + 1, high);

    }

    public int partition(ArrayList<Integer> list, int low, int high) {
//        System.out.println("----------------------------------------------\n");
        int pivot = low;
        int start = low - 1;
        int end = high + 1;
//        System.out.println(list.toString() + " low : " + low + " high : " + high);
        while (true) {

            do {
                start++;
            } while (list.get(start) < list.get(pivot) );
            do {
                end--;
            } while (list.get(end) > list.get(pivot) );

            if (start >= end) {
                System.out.println(end);
                return end;
            }
            swap(list, start, end);
//            System.out.println(list.toString() + " low : " + low + " high : " + high);
        }


    }

    public void swap(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
