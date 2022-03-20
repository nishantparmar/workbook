package com.nishant.problems.lc.m;

import com.nishant.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreePathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> pathsList = new ArrayList<>();
        List<Integer> pathNodes = new ArrayList<>();
        traverse(root, targetSum, pathNodes, pathsList);
        return pathsList;
    }

    public void traverse(TreeNode root, int targetSum, List<Integer> pathNodes, List<List<Integer>> pathsList) {
        if (root == null) return;

        pathNodes.add(root.val);

        if (root.val == targetSum && root.left == null && root.right == null) {
            pathsList.add(new ArrayList<>(pathNodes));
        } else {
            traverse(root.left, targetSum - root.val, pathNodes, pathsList);
            traverse(root.right, targetSum - root.val, pathNodes, pathsList);
        }
        pathNodes.remove(pathNodes.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        TreePathSumII tps2 = new TreePathSumII();
        System.out.println(tps2.pathSum(root, 22));

    }
}
