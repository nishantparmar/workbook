package com.nishant.problems.lc.m;

import com.nishant.TreeNode;
import com.nishant.Utilities;

//https://leetcode.com/problems/binary-search-tree-iterator/

//INCOMPLETE
public class BSTIterator {

    TreeNode root;

    public BSTIterator(TreeNode root) {
        this.root= root;
    }

    TreeNode currentNode = null;
    boolean left = false;
    boolean right = false;
    boolean isRootVisited = false;
    public int next() {
        if(currentNode == null){
            currentNode = root;
        }

        if (currentNode.left != null && !left){
            int val = currentNode.left.val;
            left = true;
            return val;
        }else if(currentNode != null && left && !isRootVisited){
            int val = currentNode.val;
            isRootVisited = true;
            return val;
        }else if(currentNode.right != null && right && !right) {
            int val = currentNode.right.val;
            right = true;
            return val;
        }
        return -1;
    }

    public boolean hasNext() {
        if(!left || !right || !isRootVisited){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        Utilities.printBinaryTree(root,0);
        BSTIterator iterator = new BSTIterator(root);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
