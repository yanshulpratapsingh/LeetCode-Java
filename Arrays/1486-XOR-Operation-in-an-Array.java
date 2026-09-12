// LeetCode: 1486. XOR Operation in an Array
// Difficulty: Easy
// Topic: Array / Bit Manipulation
// Approach: Create the array using nums[i] = start + 2*i and calculate XOR of all elements.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int xor = 0;

        for(int i=0 ; i<nums.length ; i++){
            nums[i] = start + 2 * i;
            xor = xor ^ nums[i];
        }

        return xor;
    }
}