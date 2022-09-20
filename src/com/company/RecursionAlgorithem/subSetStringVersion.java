package com.company.RecursionAlgorithem;

import java.util.ArrayList;

public class subSetStringVersion {

    public ArrayList<String> generate_all_subsets(String s) {
        // Write your code here.
        ArrayList<String> res = new ArrayList<String>();
        helper(0, s, res, "");
        return res;
    }

    public void helper(int level, String s, ArrayList<String> res, String temp) {
        if (level == s.length()) {
            res.add(temp);
            return;
        }

        //include
        temp += s.charAt(level);
        helper(level + 1, s, res, temp);
        //exclude
        temp = temp.substring(0, temp.length() - 1);
        helper(level + 1, s, res, temp);
    }


}
