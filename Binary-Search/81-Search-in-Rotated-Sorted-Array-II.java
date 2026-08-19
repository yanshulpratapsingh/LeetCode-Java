/*
 * LeetCode: 81. Search in Rotated Sorted Array II
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * Use modified binary search to search in the rotated array.
 *
 * Since duplicates are allowed, sometimes we cannot determine
 * which half is sorted. When nums[left], nums[mid] and nums[right]
 * are equal, we shrink both boundaries.
 *
 * Otherwise, determine which half is sorted and check whether
 * the target lies inside that sorted half.
 *
 * Time Complexity: O(log n) average
 * Worst Case: O(n) because of duplicates
 * Space Complexity: O(1)
 */

class Solution {

    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            /*
             * When left, mid and right are equal,
             * we cannot determine which half is sorted.
             * Shrink both boundaries.
             */
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {

                left++;
                right--;
            }

            // Left half is sorted
            else if (nums[left] <= nums[mid]) {

                // Target lies inside the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}