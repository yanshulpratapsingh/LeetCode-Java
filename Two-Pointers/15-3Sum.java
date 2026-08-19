/*
 * LeetCode: 15. 3Sum
 * Difficulty: Medium
 * Topic: Array / Sorting / Two Pointers
 *
 * Approach:
 * First sort the array.
 *
 * Fix one element using the i pointer, then use two pointers:
 *
 * left  -> starts from i + 1
 * right -> starts from the end
 *
 * For every fixed element:
 *
 * If the sum is 0:
 *     We found a valid triplet.
 *
 * If the sum is less than 0:
 *     Move left forward to increase the sum.
 *
 * If the sum is greater than 0:
 *     Move right backward to decrease the sum.
 *
 * Since duplicate triplets are not allowed, skip duplicate
 * values for i, left and right.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(log n) to O(n) depending on sorting implementation
 */

import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        // Sort the array to use two pointers
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Found a valid triplet
                if (sum == 0) {

                    list.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // Sum is too small
                else if (sum < 0) {
                    left++;
                }

                // Sum is too large
                else {
                    right--;
                }
            }
        }

        return list;
    }
}