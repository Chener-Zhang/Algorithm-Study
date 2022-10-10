package com.company;


import com.company.DynamicProgramming.rodCutting;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        rodCutting rodCutting = new rodCutting();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);

        rodCutting.get_maximum_profit(list);
    }
}
