/*
 * LeetCode: 27. Remove Element
 * Difficulty: Easy
 * Topic: Array / Two Pointers
 *
 * Approach:
 * Use two pointers:
 *
 * left  -> points to the position where the next valid
 *          element should be placed.
 *
 * right -> scans the complete array.
 *
 * If nums[right] is not equal to val, place it at nums[left]
 * and move left forward.
 *
 * Elements equal to val are simply skipped.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeElement(int[] nums, int val) {

        int left = 0;

        // right scans the complete array
        for (int right = 0; right < nums.length; right++) {

            // Keep only elements different from val
            if (nums[right] != val) {

                nums[left] = nums[right];
                left++;
            }
        }

        // Number of elements which are not equal to val
        return left;
    }
}s