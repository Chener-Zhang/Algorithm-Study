package com.company;


import com.company.DynamicProgramming.coinChangeII;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        coinChangeII rodCutting = new coinChangeII();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);
        System.out.println(rodCutting.change(5, new int[]{1, 2, 5}));

    }
}
