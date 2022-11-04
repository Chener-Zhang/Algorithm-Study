package com.company.String;

import com.company.LeetcodeProblem;

public class isAnagram implements LeetcodeProblem {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a'] +=1;
        }
        for (char c : t.toCharArray()) {
            arr[c - 'a'] -=1;
        }
        for (int i : arr) {
            if (i != 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
