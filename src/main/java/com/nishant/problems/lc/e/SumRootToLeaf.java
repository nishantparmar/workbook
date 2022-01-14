package com.nishant.problems.lc.e;


//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
//EASY
public class SumRootToLeaf {
    static TreeNode root;

    public SumRootToLeaf(TreeNode root) {
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

    public Integer traverse(TreeNode root) {
        Integer result = 0;
        if (root == null) {
            return 0;
        }
        int height = height();
        for (int i = 0; i <= height; i++) {
            result = addValueCurrentLevel(root, i, result);
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

    private int addValueCurrentLevel(TreeNode root, int level, int result) {
        if (root == null)
            return 0;
        if (level == 1){
           result = result + Integer.parseInt(""+root.val,2);
        }
        else if (level > 1) {
            addValueCurrentLevel(root.left, level - 1, result);
            addValueCurrentLevel(root.right, level - 1, result);
        }
        return result;
    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(0);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(1);

        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(1);

        SumRootToLeaf lot = new SumRootToLeaf(root1);

        System.out.println("Level order traversal: " + lot.traverse(root1));
    }

}
