/*
 * LeetCode: 3090. Maximum Length Substring With Two Occurrences
 * Difficulty: Easy
 * Topic: String / Sliding Window
 *
 * Approach:
 * Maintain a sliding window where each character can occur
 * at most two times.
 *
 * Expand the window using the right pointer.
 * If the current character occurs more than twice, shrink
 * the window from the left until the condition becomes valid.
 *
 * The maximum valid window length is the answer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maximumLengthSubstring(String s) {

        // Frequency of each lowercase English character
        int[] freq = new int[26];

        int left = 0;
        int ans = 0;

        // Expand the window using right pointer
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            freq[c - 'a']++;

            // If any character occurs more than twice,
            // shrink the window from the left.
            while (freq[c - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // Update maximum valid window length
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}