package com.nishant.problems.lc.m.completed;

import com.nishant.TreeNode;

import java.util.Stack;

//https://leetcode.com/problems/inorder-successor-in-bst/

/**
 * we'll make use of the standard BST property where the left descendants have smaller values than
 * the current node and right descendants have larger values than the current node.
 *
 *  We don't need to handle any specific cases here and we can start with the root node directly
 *  and reach our inorder successor.
 *  Let's see the choices we have when comparing the value of the given node 'node' to the current node
 *  in the tree.
 */
public class InorderSuccessorBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode node) {
        TreeNode successor = null;
        while (root != null) {
            if (node.val >= root.val) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }

    /**
     * Using Stack
     * */
    public TreeNode inorderSuccessor_usingStatck(TreeNode root, TreeNode p) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        boolean found = false;
        while (node != null || !s.isEmpty()) {
            while (node != null) {
                s.push(node);
                node = node.left;
            }

            node = s.pop();
            if (found) {
                return node;
            }
            if (node.val == p.val) {
                found = true;
            }
            node = node.right;
        }

        return null;
    }
}
