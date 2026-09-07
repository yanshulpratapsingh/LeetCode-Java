/*
 * LeetCode: 1695. Maximum Erasure Value
 * Difficulty: Medium
 * Topic: Sliding Window / HashSet
 *
 * Approach:
 * Maintain a sliding window containing only unique elements.
 *
 * Use a HashSet to keep track of elements present in the
 * current window and maintain the sum of the current window.
 *
 * If a duplicate element is found, move the left pointer
 * forward and remove elements from the set and current sum
 * until the window becomes unique again.
 *
 * For every valid window, update the maximum sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int currSum = 0;
        int maxSum = 0;

        for(int right=0 ; right<nums.length ; right++){

            // Remove elements until the window becomes unique
            while(set.contains(nums[right])){
                currSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            // Add the current unique element
            set.add(nums[right]);
            currSum += nums[right];

            // Update maximum score
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}