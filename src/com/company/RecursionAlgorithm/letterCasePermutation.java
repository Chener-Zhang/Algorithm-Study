package com.company.RecursionAlgorithm;

import com.company.LeetcodeProblem;

import java.util.ArrayList;
import java.util.List;

public class letterCasePermutation implements LeetcodeProblem {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        helper(0, res, arr);
        return res;
    }

    public void helper(int level, List<String> res, char[] arr) {
        if (level == arr.length) {
            res.add(new String(arr));
            return;
        }

        char current = arr[level];
        if (Character.isLetter(current)) {
            arr[level] = Character.toUpperCase(arr[level]);
            helper(level + 1, res, arr);

            arr[level] = Character.toLowerCase(arr[level]);
            helper(level + 1, res, arr);
        } else {
            helper(level + 1, res, arr);
        }
    }


    @Override
    public void run() {
        letterCasePermutation("hellw");
    }
}
