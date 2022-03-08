package com.nishant.problems.lc.e.completed;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/
//COMPLETED
class MinStack {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        data.push(val);
    }

    public void pop() {
        if (min.peek().equals(data.peek())) {
            min.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();

    }

    public long getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
//        ["MinStack","push","push","push","getMin","top","pop","getMin"]
//        [[],          [-2],   [0],  [-1], [],     [],     [], []]
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(6);
        ms.push(2);
        System.out.println(ms.getMin());
        System.out.println(ms.top());
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
}