/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // both are empty, so they are the same
        }
        if (p == null || q == null) {
            return false; // one is empty and the other is not, so they are different
        }
        if (p.val != q.val) {
            return false; // the values of the current nodes are different
        }
        // recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// @lc code=end
