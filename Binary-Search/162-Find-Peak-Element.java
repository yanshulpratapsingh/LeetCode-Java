/*
 * LeetCode: 162. Find Peak Element
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * Use binary search to find a peak element.
 *
 * If nums[mid] is greater than both neighbors, mid is a peak.
 *
 * If nums[mid] < nums[mid + 1], we are on an increasing slope,
 * so a peak must exist on the right side.
 *
 * Otherwise, a peak must exist on the left side.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        // Search for a peak using binary search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if ((mid == nums.length - 1 || nums[mid] > nums[mid + 1]) &&
                (mid == 0 || nums[mid] > nums[mid - 1])) {

                ans = mid;
                right = mid - 1;
            }

            // Increasing slope: peak exists on the right
            else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }

            // Decreasing slope: peak exists on the left
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}