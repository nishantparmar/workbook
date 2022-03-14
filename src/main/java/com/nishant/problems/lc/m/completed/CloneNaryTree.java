package com.nishant.problems.lc.m.completed;

import com.nishant.Node;

import java.util.ArrayList;

//https://leetcode.com/problems/clone-n-ary-tree/
public class CloneNaryTree {
    public Node cloneTree(Node root) {
        if (root == null) return null;
        Node clonedTree = new Node(root.val);//Create root same as original
        clonedTree.children = new ArrayList<>(); // Create empty child list
        for (Node child : root.children) {//Iterate over original tree child
            clonedTree.children.add(cloneTree(child));//add children recursively
        }
        return clonedTree;
    }

    public static void main(String[] args) {
        ArrayList<Node> children1 = new ArrayList<>();
        Node child1 = new Node(3);
        children1.add(new Node(2));
        children1.add(new Node(4));
        Node root = new Node(1, children1);

        CloneNaryTree cloneTree = new CloneNaryTree();
        System.out.println(cloneTree.cloneTree(root));
    }

}
