// LeetCode: 1431. Kids With the Greatest Number of Candies
// Difficulty: Easy
// Topic: Array / Greedy
// Approach: Find the maximum candies, then check whether each kid can reach or exceed it after receiving all extra candies.
// Time Complexity: O(n)
// Space Complexity: O(n) - for the result list

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;

        // Find the maximum number of candies
        for(int i : candies){
            max = Math.max(max, i);
        }

        // Check each kid
        for(int i : candies){
            ans.add((i + extraCandies) >= max);
        }

        return ans;
    }
}