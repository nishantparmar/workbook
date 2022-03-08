package com.nishant.problems.lc.e.completed;

import com.nishant.TreeNode;
//https://leetcode.com/problems/same-tree/
//COMPLETED
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
    }

    public static void main(String[] args) {
        //1,null,2,4,null,null,3
        TreeNode p = new TreeNode(1);
        p.right = new TreeNode(2);
        p.left = new TreeNode(4);
        p.right.left = new TreeNode(3);

        //[1,null,4,2,null,null,3]
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(4);
        q.left = new TreeNode(2);
        q.left.right = new TreeNode(3);

        SameTree st = new SameTree();
        System.out.println(st.isSameTree(p, q));
    }
}