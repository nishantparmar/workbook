package com.nishant.problems.lc.m;

import com.nishant.TreeNode;

public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        traverseLeft(root);
    }

    private void traverseLeft(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        traverseLeft(root.left);
    }

    private void traverseRight(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        traverseRight(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        FlattenBinaryTree fbt = new FlattenBinaryTree();
        fbt.flatten(root);

    }
}

