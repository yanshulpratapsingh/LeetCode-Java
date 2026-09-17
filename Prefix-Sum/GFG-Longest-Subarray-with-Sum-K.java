// GFG: Longest Subarray with Sum K
// Difficulty: Medium
// Topic: Prefix Sum / HashMap
// Approach: Store the first occurrence of every prefix sum.
//            If (sum - k) exists, the subarray between that index and
//            the current index has sum k. Use the earliest occurrence
//            to get the maximum possible length.
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Check if a previous prefix sum = sum - k exists
            if(map.containsKey(sum - k)) {
                maxlen = Math.max(maxlen, i - map.get(sum - k));
            }

            // Store only the first occurrence
            // to maximize the subarray length
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxlen;
    }
}