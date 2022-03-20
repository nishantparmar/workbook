package com.nishant.problems.lc.e;

import com.nishant.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private StringBuilder path = new StringBuilder();
    private List<String> result = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        visit(root);
        return result;
    }

    private void visit(TreeNode root) {
        if (root == null) return;
        path.append(root.val);

        if (root.left == null && root.right == null) {
            // leaf just need to add its value (+ root.val), no need to (+ "->")
            path.append(root.val);
            result.add(new String(path));
            // backtrack
            path.append(path.substring(0, path.length() - 1));
            return;
        }
        path.append(root.val + "->");
        visit(root.left);
        visit(root.right);
        path = new StringBuilder(path.substring(0, path.length() - 3));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        BinaryTreePaths btp = new BinaryTreePaths();
        System.out.println(btp.binaryTreePaths(root));

    }
}
