/*
 * LeetCode: 168. Excel Sheet Column Title
 * Difficulty: Easy
 * Topic: Math / String
 *
 * Approach:
 * Excel columns use a 1-based numbering system:
 * A -> 1, B -> 2, ..., Z -> 26.
 *
 * Since normal modulo works with 0-based values,
 * decrease columnNumber by 1 before calculating the remainder.
 *
 * The remainder gives the current character:
 * 0 -> A, 1 -> B, ..., 25 -> Z.
 *
 * Append each character to StringBuilder.
 * Since characters are generated from right to left,
 * reverse the StringBuilder at the end.
 *
 * Time Complexity: O(log26(n))
 * Space Complexity: O(log26(n))
 */

class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {

            // Convert 1-based numbering to 0-based
            columnNumber--;

            int rem = columnNumber % 26;

            // Convert 0-25 into A-Z
            ans.append((char) ('A' + rem));

            columnNumber /= 26;
        }

        return ans.reverse().toString();
    }
}