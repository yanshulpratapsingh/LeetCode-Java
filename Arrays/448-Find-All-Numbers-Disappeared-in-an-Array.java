// LeetCode: 448. Find All Numbers Disappeared in an Array
// Difficulty: Easy
// Topic: Array / In-Place Index Marking
// Approach: Use the array itself as a frequency marker.
//            For every value x, mark nums[x-1] as negative.
//            Positive positions after marking represent missing numbers.
// Time Complexity: O(n)
// Space Complexity: O(1) - excluding the output list

import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Mark the index corresponding to every number as negative
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        // Positive values indicate missing numbers
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i + 1);
            }
        }

        return ans;
    }
}