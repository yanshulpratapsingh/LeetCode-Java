// LeetCode: 974. Subarray Sums Divisible by K
// Difficulty: Medium
// Topic: Prefix Sum / HashMap
// Approach: Store the frequency of each prefix-sum remainder.
//            If the same remainder appears again, the subarray between
//            those two prefix sums has a sum divisible by k.
// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        int count = 0;

        // Empty prefix has remainder 0
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];

            int rem = currsum % k;

            // Java can produce a negative remainder
            if (rem < 0) {
                rem += k;
            }

            // Same remainder means the subarray sum is divisible by k
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            // Store/update frequency of this remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}