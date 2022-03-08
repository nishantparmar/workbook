package com.nishant.problems.lc.e;

import com.nishant.TreeNode;

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
public class SecondMinimumNodeBinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        int min = -1;

        return traverse(root, min, root.val);
    }

    private int traverse(TreeNode root, int min, int val) {
        if (root == null) {
            return min;
        }

        int leftMin = traverse(root.left, min, val);
        int rightMin = traverse(root.right, min, val);

        if(leftMin < rightMin){
            min = leftMin;
        }else if(rightMin < leftMin){
            min = rightMin;
        }else {
            min = -1;
        }
       // min = Math.min(leftMin, rightMin);
        return min;
    }

    public static void main(String[] args) {
        SecondMinimumNodeBinaryTree smbt = new SecondMinimumNodeBinaryTree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(smbt.findSecondMinimumValue(root));
    }
}
