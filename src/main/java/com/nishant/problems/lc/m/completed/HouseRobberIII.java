package com.nishant.problems.lc.m.completed;

import com.nishant.TreeNode;

import java.util.HashMap;

//https://leetcode.com/problems/house-robber-iii/
public class HouseRobberIII {
    HashMap<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (map.containsKey(root)) return map.get(root);
        if (root == null) return 0;

        int val = 0;
        if (root.left != null) {
            val = rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }

        int result = Math.max(val + root.val, rob(root.left) + rob(root.right));
        map.put(root, result);

        return result;
    }

    public static void main(String[] args) {

    }
}
