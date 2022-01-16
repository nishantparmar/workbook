package com.nishant;

public class Utilities {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
        }
    }

    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            System.out.print(current.val + "-->");
            current = current.next;
        }
        System.out.println(current.val);
    }
}