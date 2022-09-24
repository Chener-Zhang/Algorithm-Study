package com.company.RecursionAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class palindromePartition {
    List<List<String>> res;
    String s;

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        this.s = s;
        helper(0, new ArrayList());
        return res;
    }

    public void helper(int previousEnd, List<String> temp) {
        if (previousEnd >= s.length()) {
            res.add(new ArrayList(temp));
            return;
        }

        for (int i = previousEnd; i < s.length(); i++) {
            if (isPalindrome(previousEnd, i)) {
                temp.add(s.substring(previousEnd, i + 1));
                helper(i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
