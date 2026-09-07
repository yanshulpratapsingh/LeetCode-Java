/*
 * LeetCode: 1004. Max Consecutive Ones III
 * Difficulty: Medium
 * Topic: Sliding Window / Two Pointer
 *
 * Approach:
 * Maintain a sliding window using two pointers: left and right.
 *
 * Count the number of zeros inside the current window.
 *
 * If the number of zeros becomes greater than k,
 * move the left pointer forward until the window becomes valid again.
 *
 * The length of the valid window represents the maximum
 * consecutive 1's possible by flipping at most k zeros.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zero = 0;
        int max = 0;

        for(int right=0 ; right<nums.length ; right++){

            // Count zero in the current window
            if(nums[right]==0){
                zero++;
            }

            // Shrink the window if zeros exceed k
            while(zero>k){

                if(nums[left]==0){
                    zero--;
                }

                left++;
            }

            // Update maximum valid window length
            max = Math.max(max, right-left+1);
        }

        return max;
    }
}