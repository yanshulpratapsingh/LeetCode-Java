/*
 * LeetCode: 1523. Count Odd Numbers in an Interval Range
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * The number of odd numbers from 0 to x is (x + 1) / 2.
 *
 * Therefore, the number of odd numbers in the range
 * [low, high] is:
 *
 * (high + 1) / 2 - low / 2
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int countOdds(int low, int high) {

        // Count odd numbers in the given range
        return (high + 1) / 2 - (low / 2);
    }
}