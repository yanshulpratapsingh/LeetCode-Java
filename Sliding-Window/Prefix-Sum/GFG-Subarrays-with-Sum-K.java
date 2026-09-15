// GFG: Subarrays with Sum K
// Difficulty: Medium
// Topic: Prefix Sum / HashMap
// Approach: Store the frequency of previous prefix sums.
//            For current prefix sum, if (sum - k) exists,
//            then those previous prefix sums form subarrays with sum exactly k.
// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.*;
class Solution {
    public int cntSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        // Empty prefix
        map.put(0, 1);

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            // Check whether a previous prefix sum = sum - k exists
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            // Store frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}