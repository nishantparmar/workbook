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
        while (current != null && current.next != null) {
            System.out.print(current.val + "-->");
            current = current.next;
        }
        if (current != null) {
            System.out.println(current.val);
        } else {
            System.out.println("Empty List");
        }
    }

    public static void printBinaryTree(TreeNode root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + root.val);
        } else
            System.out.println(root.val);
        printBinaryTree(root.left, level + 1);
    }

    public static void printTrie(TrieNode root){
        TrieNode current = root;
        for (int i = 0; i < current.children.length; i++) {
            System.out.println(current.children[i] == null? "":current.children[i]  + " ");
        }
    }
}