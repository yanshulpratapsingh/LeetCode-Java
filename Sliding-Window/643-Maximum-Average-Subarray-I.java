/*
 * LeetCode: 643. Maximum Average Subarray I
 * Difficulty: Easy
 * Topic: Array / Sliding Window
 *
 * Approach:
 * Use a sliding window of fixed size k.
 *
 * First, calculate the sum of every window of size k.
 * When the window reaches size k, compare its sum
 * with the maximum sum found so far.
 *
 * After processing a window, remove the leftmost element
 * and move the left pointer forward.
 *
 * Finally, divide the maximum window sum by k
 * to get the maximum average.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        double sum = 0;

        // Stores the maximum sum of a window of size k
        double ans = Double.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to the window
            sum += nums[right];

            // Window size becomes k
            if (right - left + 1 == k) {

                // Update maximum window sum
                ans = Math.max(ans, sum);

                // Remove leftmost element
                // before moving the window
                sum -= nums[left];
                left++;
            }
        }

        // Average = maximum sum / window size
        return ans / k;
    }
}