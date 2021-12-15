package com.nishant.ds;

import com.nishant.ds.tree.Node;
import com.nishant.ds.tree.Tree;

public class SubTreeInBST {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(20);

        tree.insert(30);
        tree.insert(10);
        tree.insert(6);
        tree.insert(14);
        tree.insert(24);
        tree.insert(3);
        tree.insert(8);
        tree.insert(26);

        System.out.println(tree.treeToList());
    }
}
