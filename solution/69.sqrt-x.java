/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int mid = x / 2;
        int ret = 0;
        for (int i = 1; i <= mid + 1; i++) {
            if (i == x / i) {
                return i;
            } else if (i < x / i) {
                continue;
            } else {
                return ret = i - 1;
            }
        }
        return ret;
    }
}
// @lc code=end
