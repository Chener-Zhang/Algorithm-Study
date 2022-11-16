package com.company.QueueAndStack;

import java.util.Stack;

public class decodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder tempStore = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
                    tempStore.insert(0, stack.pop());
                }
                //pop [
                stack.pop();
                StringBuilder number = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    number.insert(0, stack.pop());
                }
                int count = Integer.parseInt(number.toString());
                while (count > 0) {
                    for (char temp : tempStore.toString().toCharArray()) {
                        stack.push(temp);
                    }
                    count--;
                }

            }
        }
        String results = "";
        for (char c : stack.toString().toCharArray()) {
            if (Character.isLetter(c)) {
                results += c;
            }
        }

//        System.out.println(results);
        return results;
    }
}
