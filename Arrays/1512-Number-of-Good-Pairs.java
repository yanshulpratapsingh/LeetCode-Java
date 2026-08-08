/*
 * LeetCode: 1512. Number of Good Pairs
 * Difficulty: Easy
 * Topic: Array
 *
 * Approach:
 * Compare every pair of elements in the array.
 * If two elements are equal, they form a good pair.
 * Since j starts from i + 1, we automatically ensure i < j.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {

    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        // Check every possible pair
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Count the pair if both values are equal
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}