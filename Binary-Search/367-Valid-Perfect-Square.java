/*
 * LeetCode: 367. Valid Perfect Square
 * Difficulty: Easy
 * Topic: Binary Search
 *
 * Approach:
 * Use binary search to find an integer whose square
 * is equal to the given number.
 *
 * If mid * mid equals num, it is a perfect square.
 * If the square is smaller, search in the right half.
 * Otherwise, search in the left half.
 *
 * long is used to safely calculate mid * mid
 * without integer overflow.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;

        // Search for the square root using binary search
        while (left <= right) {

            long mid = left + (right - left) / 2;
            long square = mid * mid;

            // Perfect square found
            if (square == num) {
                return true;
            }

            // Search in the right half
            else if (square < num) {
                left = mid + 1;
            }

            // Search in the left half
            else {
                right = mid - 1;
            }
        }

        // No integer square root found
        return false;
    }
}