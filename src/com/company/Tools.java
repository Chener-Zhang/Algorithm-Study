package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tools {
    //Tools---------------------------------------------------------------------------------------------------------->
    public ArrayList<Integer> toArrayList(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : arr) {
            res.add(i);
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> toTwoDArray(int[][] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int[] current : arr) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : current) {
                temp.add(i);
            }
            res.add(temp);
        }
        return res;
    }

    public List<List<Integer>> toTwoDArrayList(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] current : arr) {
            List<Integer> temp = new ArrayList<>();
            for (int i : current) {
                temp.add(i);
            }
            res.add(temp);
        }
        return res;
    }

    public ArrayList<Integer> RandomNumberGenerator(int upperbound) {
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
