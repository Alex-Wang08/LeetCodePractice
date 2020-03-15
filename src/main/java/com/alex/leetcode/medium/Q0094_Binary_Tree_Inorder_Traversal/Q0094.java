package com.alex.leetcode.medium.Q0094_Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q0094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal_Recursion(root);
    }

    // iterative method
    private List<Integer> inorderTraversal_Iteration(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (node != null) stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }

        return list;
    }

    // recursive method
    private List<Integer> inorderTraversal_Recursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal_Recursion(list, root);
        return list;
    }

    private void inorderTraversal_Recursion(List<Integer> list, TreeNode node) {
        if (node == null) return;
        if (node.left != null) inorderTraversal_Recursion(list, node.left);
        if (node.right != null) inorderTraversal_Recursion(list, node.right);
    }
}
