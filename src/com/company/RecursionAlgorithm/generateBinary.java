package com.company.RecursionAlgorithm;

import java.util.ArrayList;

public class generateBinary {

    public ArrayList<String> get_binary_strings(Integer n) {
        // Write your code here.
        return helper(n);
    }

    public ArrayList<String> helper(Integer n) {
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<String> results = new ArrayList<String>();

        if (n == 1) {
            results.add("0");
            results.add("1");
            return results;
        } else {
            temp = helper(n - 1);
            for (String current : temp) {
                String a = current + "0";
                String b = current + "1";
                results.add(a);
                results.add(b);
            }
        }
        return results;
    }

}
