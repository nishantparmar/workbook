package com.nishant.problems.lc.m;

import com.nishant.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class BinaryTreeZigzag {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        int levels = height(root) + 1;
        for (int level = 1; level <= levels; level++) {
            addValueCurrentLevel(root, level, res);
        }

        List<Integer> r = new ArrayList<>();
        r.add(res.get(0));
        result.add(r);
        int index = 0;
        for (int i = 1; i < res.size(); i++) {
            if(index == 0){
                r = new ArrayList<>();
            }
            r.add(res.get(i));
            if(index ==1){
                result.add(r);
                index = 0;
            }else {
                index++;
            }
        }

        return result;
    }

    int height(TreeNode root) {
        if (root == null) return -1;
        return checkHeight(root);
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(checkHeight(root.left), checkHeight(root.right));
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    private void addValueCurrentLevel(TreeNode root, int level, List result) {
        if (root == null)
            return;
        if (level == 1)
            result.add(root.val);
        else if (level > 1) {
            if (level % 2 == 0) {
                addValueCurrentLevel(root.right, level - 1, result);
                addValueCurrentLevel(root.left, level - 1, result);
            } else {
                addValueCurrentLevel(root.left, level - 1, result);
                addValueCurrentLevel(root.right, level - 1, result);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTreeZigzag zig = new BinaryTreeZigzag();
        System.out.println(zig.zigzagLevelOrder(root));
    }

}
