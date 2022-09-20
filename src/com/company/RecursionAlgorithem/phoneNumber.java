package com.company.RecursionAlgorithem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneNumber {

    public ArrayList<String> get_words_from_phone_number(String phone_number) {
        // Write your code here.
        Map<Character, String> map = new HashMap<Character, String>() {
            {
                put('1', "");
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
                put('0', "");
            }
        };
        ArrayList<String> res = new ArrayList<>();
        phone_number = phone_number.replace("1", "");
        phone_number = phone_number.replace("0", "");
        if (phone_number.length() == 0) {
            res.add("-1");
        } else {
            helper(phone_number, 0, res, "", map);
        }
        return res;
    }

    public void helper(String digits, int index, ArrayList<String> res, String temp, Map<Character, String> map) {

        if (digits.length() == index) {
            res.add(temp);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (Character c : letters.toCharArray()) {
            temp += c;
            helper(digits, index + 1, res, temp, map);
            temp = temp.substring(0, temp.length() - 1);
        }


    }
}
