/*
 * LeetCode: 1456. Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 * Topic: String / Sliding Window
 *
 * Approach:
 * Use a sliding window of fixed size k.
 *
 * Keep track of the number of vowels in the current window.
 *
 * When the window reaches size k:
 * 1. Update the maximum vowel count.
 * 2. Remove the leftmost character from the window.
 * 3. Move the left pointer forward.
 *
 * A helper method is used to check whether a character is a vowel.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length();
        int left = 0;
        int right = 0;

        // Vowel count in the current window
        int count = 0;

        // Maximum vowel count found so far
        int maxCount = 0;

        while (right < n) {

            // Add current character to the window
            if (isVowel(s.charAt(right))) {
                count++;
            }

            // Window size becomes k
            if (right - left + 1 == k) {

                // Update maximum vowel count
                maxCount = Math.max(count, maxCount);

                // Remove leftmost character
                // before moving the window
                if (isVowel(s.charAt(left))) {
                    count--;
                }

                left++;
            }

            right++;
        }

        return maxCount;
    }

    // Checks whether the character is a vowel
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}