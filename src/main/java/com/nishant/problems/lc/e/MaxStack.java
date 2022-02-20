package com.nishant.problems.lc.e;

import java.util.Stack;

//https://leetcode.com/problems/max-stack/
//COMPLETED
class MaxStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();
    int max;

    public MaxStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x > maxStack.peek()) {
            maxStack.push(x);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    public int pop() {

        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = peekMax();
        Stack<Integer> temp = new Stack<>();
        while (top() != max) temp.push(pop());
        pop();
        while (!temp.isEmpty()) push(temp.pop());
        return max;
    }

    public static void main(String[] args) {
        MaxStack ms = new MaxStack();
        ms.push(5);
        ms.push(1);
//        ms.push(5);
//        System.out.println(ms.top());//5
        System.out.println(ms.popMax());//5
//        System.out.println(ms.top());//1
        System.out.println(ms.peekMax());//5
//        ms.pop();
//        System.out.println(ms.top());//5
    }
}