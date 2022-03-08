package com.nishant.problems.lc.m;

import com.nishant.TreeNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/maximum-binary-tree/
class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        int max = -1;
        int indexOfMax = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexOfMax = i;
            }
        }
        if (indexOfMax == -1) {
            return null;
        }
        return new TreeNode(nums[indexOfMax],
                buildTree(nums, start, indexOfMax - 1),
                buildTree(nums, indexOfMax + 1, end));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        MaximumBinaryTree mbt = new MaximumBinaryTree();
        TreeNode tn = mbt.constructMaximumBinaryTree(nums);
        System.out.println(tn);
    }
}