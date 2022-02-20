package com.nishant.problems.lc.m;

import com.nishant.TreeNode;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBinaryTree {

    //preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            buildTree(preorder[i], root);
        }
        return root;
    }

    TreeNode buildTree(int val, TreeNode root){
        if(val> root.val){
            root.right = new TreeNode(val);
        }else {
            root.left = new TreeNode(val);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        ConstructBinaryTree t = new ConstructBinaryTree();
        t.buildTree(preorder, inorder);
    }

}
