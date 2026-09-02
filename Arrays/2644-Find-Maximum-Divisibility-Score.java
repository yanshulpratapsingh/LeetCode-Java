/*
 * LeetCode: 2644. Find the Maximum Divisibility Score
 * Difficulty: Easy
 * Topic: Array
 *
 * Approach:
 * For every divisor, count how many elements in nums
 * are divisible by that divisor.
 *
 * Keep track of:
 * 1. Maximum divisibility score.
 * 2. Smallest divisor when multiple divisors have the same score.
 *
 * If the current divisor has a greater score, update the answer.
 * If the score is equal, choose the smaller divisor.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * n = length of nums
 * m = length of divisors
 */

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {

        int min = Integer.MAX_VALUE;
        int max = -1;

        // Check every divisor
        for (int divisor : divisors) {

            int count = 0;

            // Count numbers divisible by current divisor
            for (int num : nums) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            
            if (count > max || count == max && divisor < min) {
                max = count;
                min = divisor;
            }
        }

        return min;
    }
}