/*
 * LeetCode: 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 * Topic: Sliding Window / Frequency Counting
 *
 * Approach:
 * Maintain a sliding window using two pointers: left and right.
 *
 * Store the frequency of each uppercase character in the current
 * window using a frequency array of size 26.
 *
 * maxCount stores the highest frequency of any character in
 * the current window.
 *
 * Characters that need to be replaced:
 *
 * window length - maxCount
 *
 * If this value becomes greater than k, shrink the window
 * by moving the left pointer.
 *
 * Otherwise, update the maximum window length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int max = 0;
        int [] count = new int[26];
        int maxCount = 0;

        for(int right=0 ; right<s.length() ; right++){

            // Add current character to the frequency array
            char ch_r = s.charAt(right);
            count[ch_r-'A']++;

            // Update the highest frequency character
            maxCount = Math.max(maxCount, count[ch_r-'A']);

            // Check how many characters need to be replaced
            while((right-left+1) - maxCount > k){

                // Remove the left character from the window
                count[s.charAt(left)-'A']--;
                left++;
            }

            // Update maximum valid window length
            max = Math.max(max, right-left+1);
        }

        return max;
    }
}