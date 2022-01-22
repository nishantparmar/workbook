package com.nishant.problems.patterns.breadthforsearch;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-level-order-traversal/
//MEDIUM

public class LevelOrderTraversal {
    static TreeNode root;

    public LevelOrderTraversal(TreeNode root) {
        this.root = root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return new ArrayList<>();
        }
        int height = height();
        for (int i = 0; i <= height; i++) {
            addValueCurrentLevel(root, i, result);
        }
        return result;
    }

    int height() {
        if (root == null) return -1;
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf()) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private boolean isLeaf() {
        return root.left == null && root.right == null;
    }

    private void addValueCurrentLevel(TreeNode root, int level, List result) {
        if (root == null)
            return;
        if (level == 1)
            result.add(root.val);
        else if (level > 1) {
            addValueCurrentLevel(root.left, level - 1, result);
            addValueCurrentLevel(root.right, level - 1, result);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        /*TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);*/
        LevelOrderTraversal lot = new LevelOrderTraversal(root);
        List<List<Integer>> result = lot.traverse(root);
//        System.out.println("Level order traversal: " + result);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(0);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(1);

        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(1);
        System.out.println("Level order traversal: " + lot.traverse(root));
    }

}
