package com.nishant.problems.lc.e.completed;

import com.nishant.TreeNode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        int depth = Integer.MIN_VALUE;
        if (root.left != null)
            depth = Math.max(height(root.left), depth);
        if (root.right != null)
            depth = Math.max(height(root.right), depth);
        return 1 + depth;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
