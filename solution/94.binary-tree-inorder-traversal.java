/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
import java.util.*;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    // Rule: Left, then this node, then Right.
    void visit(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // nothing here, stop
        }
        visit(node.left, result); // 1. do the whole left side first
        result.add(node.val); // 2. then write down this node
        visit(node.right, result); // 3. then do the whole right side
    }
}
// @lc code=end

/*
 * ============================================================================
 * Same algorithm, but the "come back later" list is
 * kept by hand in a Deque instead of by Java's hidden call stack. Survives very
 * deep trees where the recursive one would crash with StackOverflowError.
 * ============================================================================
 *
 * class SolutionIterative {
 * public List<Integer> inorderTraversal(TreeNode root) {
 * List<Integer> result = new ArrayList<>();
 *
 * // Deque used as a stack: push = put on top, pop = take off the top.
 * // It holds nodes we have walked past but still owe a visit to.
 * Deque<TreeNode> todo = new ArrayDeque<>();
 * TreeNode cur = root;
 *
 * while (cur != null || !todo.isEmpty()) {
 * // Go as far left as possible, dropping a breadcrumb at each node.
 * while (cur != null) {
 * todo.push(cur);
 * cur = cur.left;
 * }
 * // No more left. Take the last breadcrumb back.
 * cur = todo.pop();
 * result.add(cur.val); // record it now (left side is done)
 * cur = cur.right; // then explore its right subtree
 * }
 * return result;
 * }
 * }
 */
