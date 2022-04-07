package com.nishant.algo;


import com.nishant.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeBFS {
    //Non-Recursive Approach with Queue
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
            if (curr.left != null) queue.add(curr.left);

            if (curr.right != null) queue.add(curr.right);
        }
    }

    //Recursive approach without Queue
    public void bfsTraversal(TreeNode root) {
        // start from level 1 — till the height of the tree
        int level = 1;

        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
    }

    boolean printLevel(TreeNode root, int level) {
        // base case
        if (root == null) return false;

        if (level == 1) {
            System.out.print(root.val + " ");
            // return true if at least one node is present at a given level
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
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
        System.out.println();
        bfs.bfsTraversal(root);
    }
}
