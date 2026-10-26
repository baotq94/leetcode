/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if (mid > 0) {
            root.left = sortedArrayToBST(java.util.Arrays.copyOfRange(nums, 0, mid));
        }
        if (mid < nums.length - 1) {
            root.right = sortedArrayToBST(java.util.Arrays.copyOfRange(nums, mid + 1, nums.length));
        }
        return root;
    }
}
// @lc code=end
