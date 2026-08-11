/*
 * LeetCode: 33. Search in Rotated Sorted Array
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * At every step, at least one half of the array is sorted.
 *
 * If the left half is sorted, check whether the target
 * lies inside that sorted range.
 *
 * Otherwise, the right half is sorted, so check whether
 * the target lies inside the right sorted range.
 *
 * This allows us to eliminate half of the search space
 * in every iteration.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            else if (nums[left] <= nums[mid]) {

                // Target lies in the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }

                // Target lies in the right half
                else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }

                // Target lies in the left half
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}