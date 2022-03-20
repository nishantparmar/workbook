package com.nishant.problems;


import com.nishant.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeBFS {
    public void levelOrderTraversal(TreeNode root) {
        // base case
        if (root == null) {
            return;
        }

        // create an empty queue and enqueue the root node
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        TreeNode curr;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // process each node in the queue and enqueue their
            // non-empty left and right child
            curr = queue.poll();

            System.out.print(curr.val + " ");

            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeBFS bfs = new TreeBFS();
        bfs.levelOrderTraversal(root);
    }
}
