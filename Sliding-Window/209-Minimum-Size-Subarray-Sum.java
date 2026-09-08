/*
 * LeetCode: 209. Minimum Size Subarray Sum
 * Difficulty: Medium
 * Topic: Sliding Window
 *
 * Approach:
 * Maintain a sliding window using two pointers: left and right.
 *
 * Expand the window by adding nums[right] to the current sum.
 *
 * When the sum becomes greater than or equal to target,
 * update the minimum length and shrink the window from the left.
 *
 * Since all numbers are positive, removing elements from the
 * left will always decrease the sum.
 *
 * If no valid subarray is found, return 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = nums.length+1;

        for(int right=0 ; right<nums.length ; right++){

            // Expand the window
            sum += nums[right];

            // Shrink the window while sum satisfies the target
            while(sum>=target){

                // Update minimum subarray length
                min = Math.min(min, right-left+1);

                // Remove left element and move left pointer
                sum -= nums[left];
                left++;
            }
        }

        // Return 0 if no valid subarray exists
        return (min==nums.length+1) ? 0 : min;
    }
}