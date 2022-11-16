package com.company.Array;

import com.company.LeetcodeProblem;

import java.util.*;

public class groupAnagrams implements LeetcodeProblem {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();

        for (String st : strs) {
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(st);

        }

        return new ArrayList(map.values());
    }

    @Override
    public void run() {
        groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        });
    }
}
