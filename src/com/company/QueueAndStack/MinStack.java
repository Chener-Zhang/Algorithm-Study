package com.company.QueueAndStack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> main = new Stack();
    Stack<Integer> minStack = new Stack();

    public MinStack() {
        printer();
    }

    public void push(int val) {
        main.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        printer();

    }

    public void pop() {
        if (main.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        main.pop();
        printer();

    }

    public int top() {
        return main.peek();

    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            return 0;
        }
    }

    public void printer() {
        System.out.println(main.toString());
        System.out.println(minStack.toString());
        System.out.println("==========================================");
    }
}
//MinStack minstack = new MinStack();
//minstack.push(512);
//minstack.push(-1024);
//minstack.push(-1024);
//minstack.push(512);
//minstack.pop();
//System.out.println(minstack.getMin());
//minstack.pop();
//System.out.println(minstack.getMin());
//minstack.pop();
//System.out.println(minstack.getMin());