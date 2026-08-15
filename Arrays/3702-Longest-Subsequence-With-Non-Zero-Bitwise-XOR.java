/*
 * LeetCode: 3702. Longest Subsequence With Non-Zero Bitwise XOR
 * Difficulty: Medium
 * Topic: Bit Manipulation / Greedy
 *
 * Approach:
 * First calculate the XOR of all elements.
 *
 * Case 1:
 * If the XOR of the complete array is non-zero,
 * the entire array is the longest valid subsequence.
 *
 * Case 2:
 * If the total XOR is zero but there is at least one
 * non-zero element, removing one element can make the
 * XOR non-zero. Therefore, the answer is n - 1.
 *
 * Case 3:
 * If all elements are zero, every possible subsequence
 * has XOR equal to zero, so the answer is 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean hasNonZero = false;

        // Calculate XOR of all elements
        for (int num : nums) {

            xor ^= num;

            // Check whether the array contains
            // at least one non-zero element
            if (num != 0) {
                hasNonZero = true;
            }
        }

        // Entire array has non-zero XOR
        if (xor != 0) {
            return nums.length;
        }

        // XOR is zero, but a non-zero element exists
        if (hasNonZero) {
            return nums.length - 1;
        }

        // All elements are zero
        return 0;
    }
}