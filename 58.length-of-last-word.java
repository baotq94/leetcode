/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int len = 0;

        // Skip trailing spaces so we land on the last word
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word going backwards
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
// @lc code=end
