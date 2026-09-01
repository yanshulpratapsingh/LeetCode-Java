/*
 * LeetCode: 2529. Maximum Count of Positive Integer and Negative Integer
 * Difficulty: Easy
 * Topic: Array
 *
 * Approach:
 * Traverse the array and maintain two counters:
 * one for negative numbers and one for positive numbers.
 *
 * Zero is ignored because it is neither positive nor negative.
 *
 * After counting both, return the maximum of the two counts.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maximumCount(int[] nums) {

        int countpos = 0;
        int countneg = 0;

        // Count positive and negative numbers
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                countneg++;
            }
            else if (nums[i] > 0) {
                countpos++;
            }
        }

        // Return the larger count
        if (countpos > countneg) {
            return countpos;
        }
        else {
            return countneg;
        }
    }
}