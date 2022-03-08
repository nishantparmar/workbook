package com.nishant.problems.lc.m;

import com.nishant.TreeNode;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
class TreekthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        return 1 + height(root) - depth(k, root);
    }

    public int depth(int value, TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        if (value == root.val) return 0;

        return findDepth(root, 0, value);
    }

    private int findDepth(TreeNode currentNode, int depth, int value) {
        depth = depth + 1;
        if (value > currentNode.val) {
            if (currentNode.right != null && currentNode.right.val == value) return depth;
            currentNode = currentNode.right;
        } else {
            if (currentNode.left != null && currentNode.left.val == value) return depth;
            currentNode = currentNode.left;
        }
        return findDepth(currentNode, depth, value);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left= new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right= new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        TreekthSmallest k = new TreekthSmallest();
        System.out.println(k.kthSmallest(root, 3));

    }
}