package com.company.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int[] arr) {
        //2 4 3 1 6
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        // Write your code here.
        for (int i = 0; i < arr.size(); i++) {
            int min = arr.get(i);
            int minIndex = i;
            for (int j = i; j < arr.size(); j++) {
                if (min > arr.get(j)) {
                    min = arr.get(j);
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
        return arr;
    }

    static void swap(int a, int b, ArrayList<Integer> arr) {
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

}
