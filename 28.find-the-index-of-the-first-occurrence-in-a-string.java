/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n)
            return -1;

        // Try every possible starting index where needle could fit
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            // Compare characters while they keep matching
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all characters, we found the first occurrence
            if (j == m)
                return i;
        }

        return -1;
    }
}
// @lc code=end
