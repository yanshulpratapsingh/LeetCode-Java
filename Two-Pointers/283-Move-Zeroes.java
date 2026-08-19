/*
 * LeetCode: 283. Move Zeroes
 * Difficulty: Easy
 * Topic: Array / Two Pointers
 *
 * Approach:
 * Use two pointers:
 *
 * right -> scans every element of the array
 * left  -> points to the position where the next non-zero
 *          element should be placed.
 *
 * Whenever a non-zero element is found, swap it with the
 * element at the left pointer and move left forward.
 *
 * This automatically moves all zeroes towards the end while
 * maintaining the relative order of non-zero elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void moveZeroes(int[] nums) {

        int left = 0;

        // right scans the complete array
        for (int right = 0; right < nums.length; right++) {

            // Found a non-zero element
            if (nums[right] != 0) {

                // Move non-zero element to the left position
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        }
    }
}