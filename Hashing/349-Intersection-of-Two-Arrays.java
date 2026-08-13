/*
 * LeetCode: 349. Intersection of Two Arrays
 * Difficulty: Easy
 * Topic: Hashing / HashSet
 *
 * Approach:
 * Store all unique elements of nums1 in a HashSet.
 *
 * Then traverse nums2 and check whether each element
 * exists in the first set.
 *
 * If it exists, add it to the result set.
 * Since result is also a HashSet, duplicate elements
 * are automatically removed.
 *
 * Finally, convert the result HashSet into an integer array.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

import java.util.HashSet;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        // Store unique elements of nums1
        HashSet<Integer> set = new HashSet<>();

        // Store unique intersection elements
        HashSet<Integer> result = new HashSet<>();

        // Add nums1 elements to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check which nums2 elements exist in nums1
        for (int num : nums2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert result set into an array
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}