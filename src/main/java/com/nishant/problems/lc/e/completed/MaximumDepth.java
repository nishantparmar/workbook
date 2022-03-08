package com.nishant.problems.lc.e.completed;

import com.nishant.TreeNode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//COMPLETED
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        return height(root) +1;
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepth md = new MaximumDepth();
        System.out.println(md.maxDepth(root));

    }

}
