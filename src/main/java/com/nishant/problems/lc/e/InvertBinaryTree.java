package com.nishant.problems.lc.e;

import com.nishant.TreeNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }else if (root.left == null && root.right == null){
            return root;
        }else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        InvertBinaryTree invert = new InvertBinaryTree();
        System.out.println(invert.invertTree(root));
    }
}
