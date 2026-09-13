// LeetCode: 2769. Find the Maximum Achievable Number
// Difficulty: Easy
// Topic: Mathematics / Observation
// Approach: Each operation can increase the achievable value of x by 2,
// so the maximum value is num + 2*t.
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public int theMaximumAchievableX(int num, int t) {

        return num + 2 * t;

    }
}