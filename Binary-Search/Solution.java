/*
 * LeetCode: 35. Search Insert Position
 * Difficulty: Easy
 * Topic: Binary Search
 *
 * Approach:
 * Use binary search on the sorted array.
 *
 * If the target is found, return its index.
 * If nums[mid] is smaller than target, search the right half.
 * Otherwise, search the left half.
 *
 * When the loop ends, left represents the correct
 * position where the target should be inserted.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Search for the target using binary search
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

        // Left is the correct insertion position
        return left;
    }
}