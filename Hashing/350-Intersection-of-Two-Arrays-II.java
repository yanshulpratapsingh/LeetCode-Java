/*
 * LeetCode: 350. Intersection of Two Arrays II
 * Difficulty: Easy
 * Topic: HashMap / Array
 *
 * Approach:
 * Store the frequency of each element from nums1 in a HashMap.
 *
 * Traverse nums2 and check whether the current element is
 * available in the HashMap with a frequency greater than 0.
 *
 * If available, add it to the result and decrease its frequency
 * because each occurrence can only be used once.
 *
 * Finally, convert the ArrayList into an int array.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + k)
 *
 * n = length of nums1
 * m = length of nums2
 * k = number of elements stored in the result
 */

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Store frequency of elements from nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersection using frequencies
        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                result.add(num);

                // Use one occurrence
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert ArrayList to int array
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}