/*
 * LeetCode: 1523. Count Odd Numbers in an Interval Range
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * The number of odd integers from 0 to x is (x + 1) / 2.
 *
 * Therefore:
 *
 * Odds from low to high
 * = Odds from 0 to high - Odds from 0 to low - 1
 *
 * = (high + 1) / 2 - low / 2
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int countOdds(int low, int high) {

        // Count odd numbers from 0 to high
        // and subtract odd numbers before low
        return (high + 1) / 2 - (low / 2);
    }
}