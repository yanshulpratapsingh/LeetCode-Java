// LeetCode: 2798. Number of Employees Who Met the Target
// Difficulty: Easy
// Topic: Array / Traversal
// Approach: Traverse the array and count employees whose working hours are at least the target.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;

        for(int i : hours){
            if(i >= target){
                count++;
            }
        }

        return count;
    }
}