package com.nishant.problems.lc.e.completed;


import com.nishant.TreeNode;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class SumRootToLeaf {

    int result = 0;
    public Integer sumRootToLeaf(TreeNode root) {
        traverse(root, 0);
        return result;
    }

    void traverse(TreeNode root, int current) {
        if (root == null) return;
        //bit addition
        current = (current << 1) | root.val;//???

        if (isLeaf(root)) {
            result += current;
        }
        traverse(root.left, current);
        traverse(root.right, current);
    }

    private static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(0);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(1);

        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(1);

        SumRootToLeaf lot = new SumRootToLeaf();

        System.out.println("Level order traversal: " + lot.sumRootToLeaf(root1));
    }

}
