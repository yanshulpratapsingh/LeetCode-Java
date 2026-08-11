/*
 * LeetCode: 2413. Smallest Even Multiple
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * If n is already even, n itself is the smallest
 * number that is a multiple of both 2 and n.
 *
 * If n is odd, multiplying it by 2 gives the smallest
 * even multiple of n.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int smallestEvenMultiple(int n) {

        // If n is already even, return n
        if (n % 2 == 0) {
            return n;
        }

        // For odd n, the smallest even multiple is 2 * n
        else {
            return n * 2;
        }
    }
}