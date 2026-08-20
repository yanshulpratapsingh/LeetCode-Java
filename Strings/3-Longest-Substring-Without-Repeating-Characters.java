/*
 * LeetCode: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Topic: String / Sliding Window / Two Pointer
 *
 * Approach:
 *
 * Use the sliding window technique with two pointers:
 * left and right.
 *
 * Maintain a frequency array to store the frequency
 * of characters inside the current window.
 *
 * Move the right pointer forward and add the current
 * character to the window.
 *
 * If the current character occurs more than once,
 * shrink the window from the left until the duplicate
 * character is removed.
 *
 * At every step, calculate the length of the current
 * valid window and update the maximum length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * n = length of the string
 */

class Solution {

    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int left = 0;
        int max = 0;

        // Expand the window using right pointer
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;

            // Duplicate character found,
            // shrink the window from the left
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            // Update maximum window length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}