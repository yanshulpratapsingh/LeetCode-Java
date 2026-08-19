/*
 * LeetCode: 540. Single Element in a Sorted Array
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * In a valid paired array, before the single element,
 * pairs start at even indices and end at odd indices.
 *
 * After the single element, this pattern is shifted.
 *
 * We use binary search to determine which side contains
 * the single element.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int singleNonDuplicate(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Check whether mid itself is the single element
            if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
                (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {

                return nums[mid];
            }

            /*
             * If mid is odd, its correct pair should be
             * on the left.
             */
            if (mid % 2 == 1) {

                if (nums[mid] == nums[mid - 1]) {
                    // Pair is correct, single element is on the right
                    left = mid + 1;
                }
                else {
                    // Pair pattern is broken, single element is on the left
                    right = mid - 1;
                }
            }

            /*
             * If mid is even, its correct pair should be
             * on the right.
             */
            else {

                if (nums[mid] == nums[mid + 1]) {
                    // Pair is correct, single element is on the right
                    left = mid + 2;
                }
                else {
                    // Pair pattern is broken, single element is on the left
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}