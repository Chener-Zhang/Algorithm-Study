package com.company.String;

import com.company.LeetcodeProblem;

import java.util.Arrays;

public class checkInclusion implements LeetcodeProblem {
    public boolean checkInclusion(String s1, String s2) {

        int compareLen = s1.length();
        int n = s2.length();
        for (int i = compareLen; i <= n; i++) {

            if (isAnagram(s1, s2.substring(i - compareLen,i))) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public boolean isAnagram(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    @Override
    public void run() {
        checkInclusion("adc", "dcda");
    }
}
