/*
 * LeetCode: 392. Is Subsequence
 * Difficulty: Easy
 * Topic: String / Two Pointers
 *
 * Approach:
 * Use two pointers:
 *
 * i -> points to the current character of s
 * j -> points to the current character of t
 *
 * Traverse t from left to right.
 * If s[i] matches t[j], move i forward.
 * Always move j forward.
 *
 * If all characters of s are matched in order,
 * then s is a subsequence of t.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * where n = length of t.
 */

class Solution {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {

            // Match found, move to next character of s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move forward in t
            j++;
        }

        // All characters of s were matched
        return i == s.length();
    }
}