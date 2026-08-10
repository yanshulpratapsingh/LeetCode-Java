/*
 * LeetCode: 744. Find Smallest Letter Greater Than Target
 * Difficulty: Easy
 * Topic: Binary Search
 *
 * Approach:
 * Use binary search to find the smallest character
 * that is strictly greater than the target.
 *
 * If letters[mid] is greater than target, store it as
 * a possible answer and search the left half for a
 * smaller valid character.
 *
 * Otherwise, search the right half.
 *
 * If no character is greater than target, return the
 * first character because the array wraps around.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        // Default answer handles the wrap-around case
        char ans = letters[0];

        // Binary search for the smallest character > target
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Possible answer found, search for a smaller one
            if (letters[mid] > target) {
                ans = letters[mid];
                right = mid - 1;
            }

            // Search in the right half
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
}