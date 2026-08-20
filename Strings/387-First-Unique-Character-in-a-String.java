/*
 * LeetCode: 387. First Unique Character in a String
 * Difficulty: Easy
 * Topic: String / Frequency Array
 *
 * Approach:
 *
 * First create a frequency array of size 256.
 *
 * Count the frequency of every character in the string.
 *
 * Then traverse the string again from left to right.
 *
 * If the frequency of the current character is 1,
 * it is the first non-repeating character.
 *
 * Return its index.
 *
 * If no character has frequency 1, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * n = length of the string
 */

class Solution {

    public int firstUniqChar(String s) {

        int[] freq = new int[256];

        // Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch] == 1) {
                return i;
            }
        }

        // No unique character exists
        return -1;
    }
}