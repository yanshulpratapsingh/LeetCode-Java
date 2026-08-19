/*
 * LeetCode: 167. Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Topic: Array / Two Pointers
 *
 * Approach:
 * Since the array is sorted, use two pointers:
 *
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * If the sum is equal to target, return both indices.
 *
 * If the sum is smaller than target, move left forward
 * to increase the sum.
 *
 * If the sum is greater than target, move right backward
 * to decrease the sum.
 *
 * The problem uses 1-based indexing, so return left + 1
 * and right + 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            // Found the required pair
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            // Need a larger sum
            else if (sum < target) {
                left++;
            }

            // Need a smaller sum
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}