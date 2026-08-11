/*
 * LeetCode: 28. Find the Index of the First Occurrence in a String
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Use Java's built-in indexOf() method to find the first
 * occurrence of needle in haystack.
 *
 * If needle is found, indexOf() returns its starting index.
 * Otherwise, it returns -1.
 *
 * Time Complexity: O(n * m)*
 * Space Complexity: O(1)
 *
 * *Actual implementation complexity may depend on the
 * underlying Java String implementation.
 */

class Solution {

    public int strStr(String haystack, String needle) {

        // Return the first occurrence of needle
        return haystack.indexOf(needle);
    }
}