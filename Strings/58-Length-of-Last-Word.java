/*
 * LeetCode: 58. Length of Last Word
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Start from the end of the string.
 *
 * First, skip all trailing spaces.
 * Then count characters until a space is found.
 *
 * The counted characters represent the last word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int lengthOfLastWord(String s) {

        // Start from the last character
        int i = s.length() - 1;
        int count = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}