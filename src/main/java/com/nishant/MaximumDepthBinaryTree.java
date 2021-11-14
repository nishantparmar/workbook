package com.nishant;

import com.nishant.tree.Node;
import com.nishant.tree.Tree;

public class MaximumDepthBinaryTree {

    public static void main(String[] args){
        Tree tree= new Tree();
        tree.root = new Node(20);
        tree.insert(30);
        tree.insert(10);
        tree.insert(6);
        tree.insert(14);
        tree.insert(24);
        tree.insert(3);
        tree.insert(8);
        tree.insert(26);
        System.out.println(maxDepth(tree.root));
    }

    public static int maxDepth(Node root) {
        if (root == null) return 0;
        return height(root);
    }

    private static int height(Node root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        return  1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private static boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }
}
