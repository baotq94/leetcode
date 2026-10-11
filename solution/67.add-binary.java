/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            int bitA = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int bitB = (j >= 0) ? (b.charAt(j) - '0') : 0;

            int sum = bitA + bitB + carry;
            sb.append(sum % 2); // ghi bit kết quả
            carry = sum / 2; // cập nhật nhớ

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
    // public String addBinary(String a, String b) {
    // int i = a.length() - 1;
    // int j = b.length() - 1;
    // int carry = 0;

    // int n = Math.max(a.length(), b.length()) + 1;
    // char[] res = new char[n];
    // int k = n - 1;

    // while (i >= 0 || j >= 0 || carry != 0) {
    // int sum = carry;
    // if (i >= 0)
    // sum += a.charAt(i--) - '0';
    // if (j >= 0)
    // sum += b.charAt(j--) - '0';
    // res[k--] = (char) ('0' + (sum & 1));
    // carry = sum >> 1;
    // }

    // return new String(res, k + 1, n - (k + 1));
    // }
}
// @lc code=end
