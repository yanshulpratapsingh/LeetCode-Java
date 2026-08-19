/*
 * LeetCode: 125. Valid Palindrome
 * Difficulty: Easy
 * Topic: String / Two Pointers
 *
 * Approach:
 * Use two pointers, one starting from the beginning and
 * one from the end of the string.
 *
 * Ignore all non-alphanumeric characters.
 * Compare the remaining characters after converting them
 * to lowercase.
 *
 * If any pair of characters is different, the string is
 * not a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from the left
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        return true;
    }
}