/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}

// • Hint: merge from the end to avoid overwriting nums1’s valid elements.
// Use three indices: i = m-1 (end of nums1’s valid part), j = n-1 (end of
// nums2), k = m+n-1 (end of nums1 buffer).
// While j >= 0, place the larger of nums1[i] and nums2[j] at nums1[k] and move
// pointers.
// If i < 0, just copy the rest of nums2.
// @lc code=end
