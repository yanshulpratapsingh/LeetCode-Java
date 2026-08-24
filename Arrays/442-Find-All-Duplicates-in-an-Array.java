/*
 * LeetCode: 442. Find All Duplicates in an Array
 * Difficulty: Medium
 * Topic: Array / Frequency Counting
 *
 * Approach:
 * Create a frequency array where the index represents the
 * value from nums.
 *
 * Traverse nums and count the frequency of every element.
 *
 * Then traverse the frequency array.
 * If the frequency of an element is greater than 1,
 * that element appears twice, so add it to the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * The original problem asks for O(1) auxiliary space.
 * This frequency-array approach uses O(n) extra space.
 */

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];

        // Count frequency of every element
        for (int i : nums) {
            freq[i]++;
        }

        // Find elements appearing more than once
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] > 1) {
                ans.add(i);
            }
        }

        return ans;
    }
}