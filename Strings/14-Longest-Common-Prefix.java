/*
 * LeetCode: 14. Longest Common Prefix
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Start with the first string as the initial prefix.
 *
 * Compare this prefix with every other string.
 *
 * If the current string does not start with the prefix,
 * keep removing the last character from the prefix until
 * it becomes a valid prefix.
 *
 * If the prefix becomes empty, there is no common prefix.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(m)
 *
 * n = number of strings
 * m = length of the prefix/string
 */

class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {

            // Keep reducing prefix until it matches
            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                // No common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}