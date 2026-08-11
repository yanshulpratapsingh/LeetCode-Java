/*
 * LeetCode: 2485. Find the Pivot Integer
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * Let the sum from 1 to n be total.
 *
 * For pivot x:
 *
 *   1 + 2 + ... + x = x + (x + 1) + ... + n
 *
 * Since:
 *
 *   Sum(1 to x) = x * (x + 1) / 2
 *
 *   Sum(1 to n) = n * (n + 1) / 2
 *
 * The pivot condition simplifies to:
 *
 *   x * x = total
 *
 * Therefore, x must be the square root of total.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int pivotInteger(int n) {

        // Calculate sum of all numbers from 1 to n
        int total = n * (n + 1) / 2;

        // Find possible pivot using square root
        int x = (int) Math.sqrt(total);

        // Check if total is a perfect square
        if (x * x == total) {
            return x;
        }

        return -1;
    }
}