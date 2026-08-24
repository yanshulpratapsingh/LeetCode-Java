/*
 * LeetCode: 443. String Compression
 * Difficulty: Medium
 * Topic: String / Two Pointers
 *
 * Approach:
 * Traverse the character array and process each group of
 * consecutive repeating characters.
 *
 * For every group:
 * 1. Store the character.
 * 2. Count how many times it occurs consecutively.
 * 3. Append the character to StringBuilder.
 * 4. If the count is greater than 1, append the count as well.
 *
 * After creating the compressed string, copy its characters
 * back into the original chars array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * The original problem asks for O(1) extra space.
 * This implementation uses StringBuilder, so it uses O(n)
 * auxiliary space.
 */

class Solution {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder("");

        int i = 0;

        // Process each group of consecutive characters
        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            // Add character
            sb.append(ch);

            // Add count only when greater than 1
            if (count > 1) {
                sb.append(count);
            }
        }

        // Copy compressed result back into original array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }
}