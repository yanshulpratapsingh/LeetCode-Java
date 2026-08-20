/*
 * LeetCode: 541. Reverse String II
 * Difficulty: Easy
 * Topic: String / Two Pointers
 *
 * Approach:
 * Convert the string into a character array because strings
 * are immutable in Java.
 *
 * For every 2k characters:
 * - Reverse the first k characters.
 * - If fewer than k characters remain, reverse all remaining
 *   characters.
 * - The remaining characters in the 2k block stay unchanged.
 *
 * Two pointers are used to reverse each required portion.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();

        // Process every 2k characters
        for (int start = 0; start < ch.length; start += 2 * k) {

            int left = start;

            // Reverse only the first k characters
            int right = Math.min(start + k - 1, ch.length - 1);

            while (left < right) {

                // Swap characters
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }

        return new String(ch);
    }
}