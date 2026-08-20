/*
 * LeetCode: 242. Valid Anagram
 * Difficulty: Easy
 * Topic: String / Frequency Array
 *
 * Approach:
 *
 * First check if both strings have the same length.
 *
 * Create two frequency arrays of size 256.
 *
 * Count the frequency of every character in both strings.
 *
 * Compare both frequency arrays.
 *
 * If any character has a different frequency,
 * the strings are not anagrams.
 *
 * Otherwise, they are anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * n = length of the string
 */

class Solution {

    public boolean isAnagram(String s, String t) {

        // Strings with different lengths cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[256];
        int[] freq1 = new int[256];

        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch] += 1;
        }

        // Count frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freq1[ch] += 1;
        }

        // Compare both frequency arrays
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != freq1[i]) {
                return false;
            }
        }

        return true;
    }
}