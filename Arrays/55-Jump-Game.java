// LeetCode: 55. Jump Game
// Difficulty: Medium
// Topic: Array / Greedy
// Approach: Track the farthest index reachable from the positions visited so far.
// If the current index is beyond the reachable range, return false.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean canJump(int[] nums) {
        int maxjump = 0;

        for(int i=0 ; i<nums.length ; i++){

            // Current index is unreachable
            if(i>maxjump){
                return false;
            }

            // Update the farthest reachable index
            maxjump = Math.max(maxjump, i+nums[i]);

            // Last index is reachable
            if(maxjump>=nums.length-1){
                return true;
            }
        }

        return true;
    }
}