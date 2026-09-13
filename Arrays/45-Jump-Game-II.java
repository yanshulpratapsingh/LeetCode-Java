// LeetCode: 45. Jump Game II
// Difficulty: Medium
// Topic: Array / Greedy
// Approach: Track the current reachable range and the farthest index
// reachable from that range. Increase the jump count when the current
// range ends and extend the range to the farthest reachable index.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currend = 0;
        int far = 0;

        for(int i=0 ; i<nums.length-1 ; i++){
            // Find the farthest index reachable from current range
            far = Math.max(far, i+nums[i]);

            // Current jump range has ended
            if(i == currend){
                jump++;
                currend = far;
            }
        }

        return jump;
    }
}