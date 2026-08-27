/*
 * LeetCode: 67. Add Binary
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Start adding both binary strings from right to left,
 * just like normal binary addition.
 *
 * Keep a carry for the next position.
 *
 * If one string is shorter, treat its missing digits as 0.
 *
 * Continue while there are digits left in either string
 * or a carry is still present.
 *
 * Build the answer in reverse order and reverse it at the end.
 *
 * Time Complexity: O(max(n, m))
 * Space Complexity: O(max(n, m))
 *
 * n = length of string a
 * m = length of string b
 */

class Solution {
    public String addBinary(String a, String b) {

        // Start from the last digit of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Carry for binary addition
        int carry = 0;

        StringBuilder result = new StringBuilder();

        // Continue until both strings and carry are processed
        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            // Add digit from string a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add digit from string b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Current binary digit
            result.append(sum % 2);

            // Carry for next position
            carry = sum / 2;
        }

        // Digits were added from right to left,
        // so reverse the result
        return result.reverse().toString();
    }
}