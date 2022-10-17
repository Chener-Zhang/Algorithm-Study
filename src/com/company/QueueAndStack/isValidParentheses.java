package com.company.QueueAndStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //if c == closing bracket ) ] }
            if (map.containsKey(c)) {
                if (stack.isEmpty()) return false;
                if (stack.peek().equals(map.get(c))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            //if c == opening bracket ([{
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
