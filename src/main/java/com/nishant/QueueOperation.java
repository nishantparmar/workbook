package com.nishant;

import java.util.PriorityQueue;

public class QueueOperation {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        System.out.println(queue.add(5));
        System.out.println(queue.add(4));
        System.out.println(queue.add(3));
        System.out.println(queue.add(2));
        System.out.println(queue.add(1));

        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
}
