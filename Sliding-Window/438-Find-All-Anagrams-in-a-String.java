/*
 * LeetCode: 438. Find All Anagrams in a String
 * Difficulty: Medium
 * Topic: Sliding Window / Frequency Counting
 *
 * Approach:
 * Store the frequency of every character in p using a frequency array.
 *
 * Maintain a fixed-size sliding window of size p.length()
 * in string s.
 *
 * For every window, compare its character frequencies with
 * the frequency table of p.
 *
 * If both frequency arrays are equal, the current window
 * is an anagram of p, so add its starting index to the answer.
 *
 * Time Complexity: O(n * 26) = O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int k = p.length();
        int[] p_table = new int[26];
        int[] w_table = new int[26];

        // Store frequency of characters in p
        for (char ch : p.toCharArray()) {
            p_table[ch - 'a']++;
        }

        // Create a fixed-size sliding window in s
        for (int right = 0; right < s.length(); right++) {

            char ch_r = s.charAt(right);
            w_table[ch_r - 'a']++;

            // When window size becomes equal to p's length
            if (right - left + 1 == k) {

                // Check whether current window is an anagram of p
                if (Arrays.equals(p_table, w_table)) {
                    ans.add(left);
                }

                // Remove left character before moving the window
                char ch_l = s.charAt(left);
                w_table[ch_l - 'a']--;
                left++;
            }
        }

        return ans;
    }
}