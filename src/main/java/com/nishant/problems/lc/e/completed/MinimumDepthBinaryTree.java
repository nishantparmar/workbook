package com.nishant.problems.lc.e.completed;

import com.nishant.TreeNode;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        int depth = Integer.MAX_VALUE;
        if (root.left != null)
            depth = Math.min(height(root.left), depth);
        if (root.right != null)
            depth = Math.min(height(root.right), depth);
        return 1 + depth;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
