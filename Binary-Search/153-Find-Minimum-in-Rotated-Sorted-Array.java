/*
 * LeetCode: 153. Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * The elements after the rotation point are smaller than
 * or equal to the last element.
 *
 * If nums[mid] <= nums[last], mid can be the minimum,
 * so store mid and search for an earlier position.
 *
 * Otherwise, the minimum must be on the right side.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        // Find the first element <= the last element
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Possible minimum found, search left for an earlier one
            if (nums[mid] <= nums[nums.length - 1]) {
                ans = mid;
                right = mid - 1;
            }

            // Minimum must be in the right half
            else {
                left = mid + 1;
            }
        }

        return nums[ans];
    }
}