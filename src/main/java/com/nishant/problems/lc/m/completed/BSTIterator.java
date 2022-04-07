package com.nishant.problems.lc.m.completed;

import com.nishant.TreeNode;
import com.nishant.Utilities;

import java.util.Stack;

//https://leetcode.com/problems/binary-search-tree-iterator/
public class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        // Stack for the recursion simulation
        this.stack = new Stack<TreeNode>();

        // Remember that the algorithm starts with a call to the helper function
        // with the root node as the input
        this.leftmostInorder(root);
    }

    private void leftmostInorder(TreeNode root) {

        // For a given node, add all the elements in the leftmost branch of the tree
        // under it to the stack.
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        // Node at the top of the stack is the next smallest element
        TreeNode topmostNode = this.stack.pop();

        // Need to maintain the invariant. If the node has a right child, call the
        // helper function for the right child
        if (topmostNode.right != null) {
            this.leftmostInorder(topmostNode.right);
        }
        return topmostNode.val;
    }

    public boolean hasNext() {
        return this.stack.size() > 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        Utilities.printBinaryTree(root, 0);
        BSTIterator iterator = new BSTIterator(root);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
