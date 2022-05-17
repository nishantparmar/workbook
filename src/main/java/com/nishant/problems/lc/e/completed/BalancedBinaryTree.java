package com.nishant.problems.lc.e.completed;

import com.nishant.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        return (Math.abs(height(root.left) - height(root.right)) < 2 )
                && isBalanced (root.left)
                && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
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
        BalancedBinaryTree btn = new BalancedBinaryTree();
        System.out.println(btn.isBalanced(root));
    }

}
