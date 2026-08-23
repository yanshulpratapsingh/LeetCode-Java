/*
 * LeetCode: 1528. Shuffle String
 * Difficulty: Easy
 * Topic: String / Array
 *
 * Approach:
 * Create a character array of the same length as the string.
 *
 * For every character at index i in the original string,
 * place that character at indices[i] in the result array.
 *
 * After all characters are placed at their correct positions,
 * convert the character array back into a String.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()];

        // Place each character at its shuffled position
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}