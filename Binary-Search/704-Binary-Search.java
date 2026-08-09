/*
 * LeetCode: 704. Binary Search
 * Difficulty: Easy
 * Topic: Binary Search
 *
 * Approach:
 * Since the array is sorted, use binary search to
 * repeatedly reduce the search range by half.
 *
 * If nums[mid] equals target, return mid.
 * If nums[mid] is smaller, search the right half.
 * Otherwise, search the left half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Continue while the search range is valid
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search in the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            }

            // Search in the left half
            else {
                right = mid - 1;
            }
        }

        // Target does not exist
        return -1;
    }
}