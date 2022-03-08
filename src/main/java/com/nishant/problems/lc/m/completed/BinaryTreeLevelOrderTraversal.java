package com.nishant.problems.lc.m.completed;

import com.nishant.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
//COMPLETED
/*
Runtime: 3 ms, faster than 14.21% of Java online submissions for Binary Tree Level Order Traversal.
Memory Usage: 42.5 MB, less than 19.47% of Java online submissions for Binary Tree Level Order Traversal.
*/
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return new ArrayList<>();
        }
        int height = height(root) + 1;
        for (int i = 0; i <= height; i++) {
            List<Integer> output = new ArrayList();
            traverse(root, i, output);
            if (!output.isEmpty())
                result.add(output);
        }
        return result;
    }

    private void traverse(TreeNode root, int level, List result) {
        if (root == null)
            return;
        if (level == 1)
            result.add(root.val);
        else if (level > 1) {
            traverse(root.left, level - 1, result);
            traverse(root.right, level - 1, result);
        }
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
        BinaryTreeLevelOrderTraversal btlot = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(btlot.levelOrder(root));

    }
}
