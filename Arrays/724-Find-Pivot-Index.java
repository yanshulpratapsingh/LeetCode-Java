/*
 * LeetCode: 724. Find Pivot Index
 * Difficulty: Easy
 * Topic: Arrays / Prefix Sum
 *
 * Approach:
 * First calculate the total sum of the array.
 *
 * For every index, calculate the right sum using:
 *
 * rightSum = totalSum - leftSum - nums[i]
 *
 * If leftSum and rightSum are equal, the current
 * index is the pivot index.
 *
 * We return immediately because the problem asks
 * for the leftmost pivot index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int pivotIndex(int[] nums) {

        // Calculate the total sum of the array
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Find the leftmost pivot index
        for (int i = 0; i < nums.length; i++) {

            // Exclude the current element from both sides
            int rightSum = totalSum - leftSum - nums[i];

            // Pivot index found
            if (rightSum == leftSum) {
                return i;
            }

            // Add current element to left sum
            leftSum += nums[i];
        }

        return -1;
    }
}