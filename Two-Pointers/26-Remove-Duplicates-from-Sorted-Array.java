/*
 * LeetCode: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Topic: Array / Two Pointers
 *
 * Approach:
 * Use two pointers:
 *
 * left  -> points to the position where the next unique
 *          element should be placed.
 *
 * right -> scans the array to find unique elements.
 *
 * Since the array is sorted, duplicates will always be
 * next to each other.
 *
 * Whenever nums[right] is different from nums[left],
 * move left forward and place nums[right] there.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeDuplicates(int[] nums) {

        int left = 0;

        // right scans the array
        for (int right = 1; right < nums.length; right++) {

            // Found a new unique element
            if (nums[right] != nums[left]) {

                left++;

                // Place unique element at the next position
                nums[left] = nums[right];
            }
        }

        // Number of unique elements
        return left + 1;
    }
}