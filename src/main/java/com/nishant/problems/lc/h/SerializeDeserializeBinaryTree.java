package com.nishant.problems.lc.h;

import com.nishant.TreeNode;
//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

public class SerializeDeserializeBinaryTree {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serializeString = new StringBuilder();
        traverse(root, serializeString);
        return serializeString.toString();
    }

    private void traverse(TreeNode root, StringBuilder serializeString) {
        if (root == null) return;
        serializeString.append(root.val).append(" ");
        traverse(root.left, serializeString);
        traverse(root.right, serializeString);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null) return null;
        if (data.length() == 0) return null;

        String[] strArr = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(strArr[0]));

        for (int i = 1; i < strArr.length; i++) {
            int val = Integer.parseInt(strArr[i]);
            if (val > root.val) {
                root.right = new TreeNode(val);
            } else {
                root.left = new TreeNode(val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        SerializeDeserializeBinaryTree sdTree = new SerializeDeserializeBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String ser = sdTree.serialize(root);
        System.out.println(ser);
        TreeNode root1 = sdTree.deserialize(ser);

        System.out.println(root1);
    }
}
