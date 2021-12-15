package com.nishant.ds.tree;

public class TestTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
//        tree.root = new Node(20);
//        tree.insert(30);
//        tree.insert(10);
//        tree.insert(6);
//        tree.insert(14);
//        tree.insert(24);
//        tree.insert(3);
//        tree.insert(8);
//        tree.insert(26);

        //tree.bfsTraversal();
        //  System.out.println(tree.find(0));
       // System.out.println(tree.height());
        //System.out.println(tree.minimum());

        //tree.traverse();

        tree.root = new Node(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(13);
        tree.insert(18);
        tree.insert(1);
        tree.insert(6);


        System.out.println(tree.rangeSumBST(tree.root, 6, 10));
    }
}
