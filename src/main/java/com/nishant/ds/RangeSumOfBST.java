package com.nishant.ds;

public class RangeSumOfBST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root.val >= low && high >= root.val) sum = sum + root.val;
        rangeSumBST(root, low, high, sum);
        return sum;
    }

    private void rangeSumBST(TreeNode node, int low, int high, int sum) {
        if(node == null) return;
        if (node.left == null) return;

        if (node.left.val >= low) {
            sum = sum + node.left.val;
        }
        if (node.right.val <= high) {
            sum = sum + node.right.val;
        }
        rangeSumBST(node.left, low, high, sum);
        rangeSumBST(node.right, low, high, sum);
    }

    public static void main(String[] args) {


    }




}
