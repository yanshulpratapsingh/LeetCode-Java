/*
 * LeetCode: 344. Reverse String
 * Difficulty: Easy
 * Topic: String / Two Pointers
 *
 * Approach:
 * Use two pointers:
 *
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * Swap the characters at both pointers and move them
 * towards the center.
 *
 * The array is modified in-place, so no extra array
 * is required.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        // Continue until both pointers meet
        while (left < right) {

            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }
}