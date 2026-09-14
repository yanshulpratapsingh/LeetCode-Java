// LeetCode: 2461. Maximum Sum of Distinct Subarrays With Length K
// Difficulty: Medium
// Topic: Sliding Window / HashSet
// Approach: Maintain a sliding window containing distinct elements using a HashSet.
//            Keep track of the current window sum and update the maximum sum whenever
//            the window size becomes k.
// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long sum = 0;
        long Max = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int right = 0; right < nums.length; right++){

            // Remove elements until the duplicate is eliminated
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            sum += nums[right];

            // If window size becomes k, check its sum
            if(right - left + 1 == k){
                Max = Math.max(Max, sum);

                // Move window forward
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return Max;
    }
}