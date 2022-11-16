package com.company.String;

import com.company.LeetcodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams implements LeetcodeProblem {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pFrenquncy = new int[26];
        for (char c : p.toCharArray()) {
            pFrenquncy[c - 'a'] += 1;
        }
        List<Integer> res = new ArrayList<>();
        int[] currentFrequency = new int[26];
        int windowSize = p.length();
        for (int i = 0; i < s.length(); i++) {

            if (i < p.length()) {
                currentFrequency[s.charAt(i) - 'a'] += 1;
            } else {
                currentFrequency[s.charAt(i) - 'a'] += 1;
                currentFrequency[s.charAt(i - windowSize) - 'a'] -= 1;

            }

            if (Arrays.equals(pFrenquncy, currentFrequency)) {

                res.add(i - windowSize + 1);
            }

        }
        return res;
    }


    @Override
    public void run() {
//        System.out.println(findAnagrams("cbaebabacd", "abc").toString());
        System.out.println(findAnagrams("abab", "ab").toString());
        System.out.println(findAnagrams("cbaebabacd", "abc").toString());
    }
}
