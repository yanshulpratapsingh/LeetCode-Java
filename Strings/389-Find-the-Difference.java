/*
 * LeetCode: 389. Find the Difference
 * Difficulty: Easy
 * Topic: String / Bit Manipulation / XOR
 *
 * Approach:
 *
 * String t is formed by shuffling string s and adding
 * one extra character.
 *
 * XOR has two important properties:
 *
 * 1. x ^ x = 0
 * 2. x ^ 0 = x
 *
 * Therefore, when we XOR all characters of both strings,
 * every character that appears in both strings cancels out.
 *
 * Only the extra character remains.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public char findTheDifference(String s, String t) {

        char c = 0;

        // XOR all characters of s
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }

        // XOR all characters of t
        for (char ct : t.toCharArray()) {
            c ^= ct;
        }

        // Only the extra character remains
        return c;
    }
}