package com.nishant.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public Node root;

    @Override
    public String toString() {
        return root.toString();
    }

    public List<Integer> treeToList() {
        var list = new ArrayList<Integer>();
        if (root == null) return list;
        treeToList(root, list);
        return list;
    }

    private void treeToList(Node node, List<Integer> list) {
        if (node == null) return;
        list.add(node.value);
        treeToList(node.leftChild, list);
        treeToList(node.rightChild, list);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        var node = new Node(value);
        Node currentNode = root;
        while (true) {
            if (value > currentNode.value) {
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = node;
                    return;
                }
                currentNode = currentNode.rightChild;
            } else {
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = node;
                    return;
                }
                currentNode = currentNode.leftChild;
            }
        }
    }

    public boolean find(int value) {
        if (root == null) {
            return false;
        }
        Node currentNode = root;
        while (currentNode != null) {
            if (value > currentNode.value) {
                if (currentNode.rightChild != null) {
                    if (currentNode.rightChild.value == value)
                        return true;
                }
                currentNode = currentNode.rightChild;
            } else {
                if (currentNode.leftChild != null) {
                    if (currentNode.leftChild.value == value)
                        return true;
                }
                currentNode = currentNode.leftChild;
            }
        }
        return false;
    }


    public void printNode(Node node) {
        System.out.println(node.value);
    }

    public int height() {
        if (root == null) return -1;
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return 0;
        if (isLeaf()) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int minimum() {
        if (root == null) throw new IllegalStateException();
        return minimum(root);
    }

    private int minimum(Node root) {
        if (isLeaf()) return root.value;
        return Math.min(minimum(root.leftChild), minimum(root.rightChild));
    }

    private boolean isLeaf() {
        return root.leftChild == null && root.rightChild == null;
    }

    //depth of a node
    public int depth(int value) {
        if (root == null) return 0;
        if (root.leftChild == null && root.rightChild == null) return 0;
        if (value == root.value) return 0;

        return findDepth(root, 0, value);
    }

    private int findDepth(Node currentNode, int depth, int value) {
        depth = depth + 1;
        if (value > currentNode.value) {
            if (currentNode.rightChild != null && currentNode.rightChild.value == value) return depth;
            currentNode = currentNode.rightChild;
        } else {
            if (currentNode.leftChild != null && currentNode.leftChild.value == value) return depth;
            currentNode = currentNode.leftChild;
        }
        return findDepth(currentNode, depth, value);
    }


    //TODO
    public void bfsTraversal() {
        if (root == null) {
            return;
        }
        int height = height();
        for (int i = 0; i <= height; i++) {
            //   for(Node node : getNodesAtDistanceK(i))
            //   printNode(node);
        }
    }

    private void printNode(Node node, int level) {
        if (node == null) return;
        if (level == 1) printNode(root);
        else if (level > 1) {
            printNode(node.leftChild, level - 1);
            printNode(node.rightChild, level - 1);
        }
    }

    private void bfsTraversal(Node node) {
        Node currentNode = node;
        if (currentNode.leftChild != null) {
            printNode(currentNode.leftChild);
        }
        if (currentNode.rightChild != null) {
            printNode(currentNode.rightChild);
        }
        bfsTraversal(currentNode.leftChild);
        bfsTraversal(currentNode.rightChild);
    }

    private void dfsTraversal(Node node) {
        Node currentNode = node;
        if (currentNode.leftChild != null) {
            printNode(currentNode.leftChild);
        }
        if (currentNode.rightChild != null) {
            printNode(currentNode.rightChild);
        }
        bfsTraversal(currentNode.leftChild);
        bfsTraversal(currentNode.rightChild);
    }

    public void traverse() {
        System.out.println("==== Pre Order Traversal");
        traversePreOrder(root);
        System.out.println("==== POST Order Traversal");
        traversePostOrder(root);
    }


    private void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
        System.out.println(root.value);
    }

    public boolean validateBST(Node root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(Node node, int min, int max) {
        if (node == null) return true;
        if (node.value < min || node.value > max)
            return false;
        return validate(node.leftChild, min, node.value - 1)
                && validate(node.rightChild, node.value + 1, max);
    }

    public void printNodesAtDistanceK(int distance) {
        printNodesAtDistanceK(root, distance);
    }

    private void printNodesAtDistanceK(Node node, int distance) {
        if (node == null) return;
        if (distance == 0) {
            printNode(node);
            return;
        }
        distance--;
        printNodesAtDistanceK(node.leftChild, distance);
        printNodesAtDistanceK(node.rightChild, distance);
    }


    public boolean equals(Tree tree) {
        if (tree == null) return false;
        if (tree.root == null) return false;
        return equals(root, tree.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) return true;
        return first != null && second != null
                && first.value == second.value
                && equals(first.leftChild, second.leftChild)
                && equals(first.rightChild, second.rightChild);
    }

    public int sum;

    public int rangeSumBST(Node root, int low, int high) {
        if (root.value >= low && high >= root.value) sum = sum + root.value;
        rangeSumBST1(root, low, high);
        return sum;
    }

    private void rangeSumBST1(Node node, int low, int high) {
        if (node == null) return;
        if (node.leftChild == null) return;

        if (node.leftChild.value >= low) {
            sum = sum + node.leftChild.value;
        }
        if (node.rightChild == null) return;

        if (node.rightChild.value <= high) {
            sum = sum + node.rightChild.value;
        }
        rangeSumBST1(node.leftChild, low, high);
        rangeSumBST1(node.rightChild, low, high);
    }

}
