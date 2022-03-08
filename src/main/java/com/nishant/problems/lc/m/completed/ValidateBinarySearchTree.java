package com.nishant.problems.lc.m.completed;

import com.nishant.TreeNode;

//https://leetcode.com/problems/validate-binary-search-tree/
//COMPLETED
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return validate(root.right, root.val, max)
                && validate(root.left, min, root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(2);
//      root.right.right = new TreeNode(6);
//      root.right.left = new TreeNode(3);
        ValidateBinarySearchTree validateBST = new ValidateBinarySearchTree();
        System.out.println(validateBST.isValidBST(root));
    }

}
