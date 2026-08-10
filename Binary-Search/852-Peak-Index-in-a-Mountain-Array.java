/*
 * LeetCode: 852. Peak Index in a Mountain Array
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * In a mountain array, values increase before the peak
 * and decrease after the peak.
 *
 * If arr[mid] >= arr[mid + 1], we are on the decreasing
 * side or at the peak, so the peak can be at mid or left.
 *
 * Otherwise, we are on the increasing side, so the peak
 * must be on the right.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 2;

        // Search for the peak using binary search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // We are at the peak or on the decreasing side
            if (arr[mid] >= arr[mid + 1]) {
                right = mid - 1;
            }

            // We are on the increasing side
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}