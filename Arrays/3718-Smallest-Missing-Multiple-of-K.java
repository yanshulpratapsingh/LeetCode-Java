/*
 * LeetCode: 3718. Smallest Missing Multiple of K
 * Difficulty: Easy
 * Topic: Array
 *
 * Approach:
 * Start with the first positive multiple of k.
 *
 * Check whether this multiple exists in the array.
 *
 * If it exists, move to the next multiple of k.
 *
 * The first multiple that is not present in the array
 * is the smallest missing multiple.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * n = size of the array
 * m = number of multiples checked
 */

class Solution {
    public int missingMultiple(int[] nums, int k) {

        // Start with the smallest positive multiple of k
        int multiple = k;

        while (true) {

            boolean found = false;

            // Check whether the current multiple exists
            for (int num : nums) {

                if (num == multiple) {
                    found = true;
                    break;
                }
            }

            // First missing multiple is the answer
            if (!found) {
                return multiple;
            }

            // Move to the next multiple of k
            multiple += k;
        }
    }
}