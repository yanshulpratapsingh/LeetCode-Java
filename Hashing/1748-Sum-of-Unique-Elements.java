/*
 * LeetCode: 1748. Sum of Unique Elements
 * Difficulty: Easy
 * Topic: HashMap / Frequency Counting
 *
 * Approach:
 * Store the frequency of every element in a HashMap.
 *
 * After building the frequency map, traverse all the keys.
 * If an element appears exactly once, add it to the sum.
 *
 * Finally, return the sum of all unique elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Add elements that appear exactly once
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }

        return sum;
    }
}