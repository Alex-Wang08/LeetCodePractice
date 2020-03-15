package com.alex.leetcode.medium.Q0113_Path_Sum_II;

import com.alex.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * Note the value of the node could be negative.
 */
public class Q0113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        generatePathSum(lists, new ArrayList<>(), root, sum);
        return lists;
    }

    // using the back-track to denote all the possible lists.
    private void generatePathSum(List<List<Integer>> lists, ArrayList<Integer> list, TreeNode node, int leftOver) {
        if (node == null) return;
        list.add(node.val);
        if (node.left == null && node.right == null && node.val == leftOver) {
            lists.add(new ArrayList<>(list));
        } else {
            generatePathSum(lists, list, node.right, leftOver - node.val);
            generatePathSum(lists, list, node.left, leftOver - node.val);
        }

        list.remove(list.size() - 1);
    }





}
