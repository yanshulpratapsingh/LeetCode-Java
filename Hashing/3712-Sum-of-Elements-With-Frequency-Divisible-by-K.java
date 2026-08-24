/*
 * LeetCode: 3712. Sum of Elements With Frequency Divisible by K
 * Difficulty: Easy
 * Topic: Array / Frequency Counting
 *
 * Approach:
 * Since nums[i] is between 1 and 100, use a frequency array
 * of size 101 instead of a HashMap.
 *
 * First, count how many times each element appears.
 *
 * Then, check every possible element.
 * If its frequency is divisible by k, add the element multiplied
 * by its frequency to the sum.
 *
 * We multiply by the frequency because the problem requires
 * including the element exactly as many times as it appears.
 *
 * Time Complexity: O(n + 100) → O(n)
 * Space Complexity: O(101) → O(1)
 */

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        int sum = 0;
        int[] freq = new int[101];

        // Count frequency of every element
        for (int i : nums) {
            freq[i]++;
        }

        // Add elements whose frequency is divisible by k
        for (int i = 1; i < 101; i++) {

            if (freq[i] != 0 && freq[i] % k == 0) {
                sum += i * freq[i];
            }
        }

        return sum;
    }
}