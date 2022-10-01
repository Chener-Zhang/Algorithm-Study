package com.company;

import com.company.TreeAlgorithm.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        bstFromPreorder bstFromPreorder = new bstFromPreorder();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[]{8, 10, 12, 15, 16, 20, 25};
        for (int i : arr) {
            list.add(i);
        }

        bstFromPreorder.helper(list,0,list.size() -1 );
    }


}
