// LeetCode: 3498. Reverse Degree of a String
// Difficulty: Easy
// Topic: String / Character Manipulation
// Approach: Calculate the reversed alphabet position of each character
//            and multiply it by its 1-based position in the string.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            
            // Reverse alphabet position:
            // a = 26, b = 25, ..., z = 1
            int reverse = 26 - (s.charAt(i) - 'a');

            // 1-based position in the string
            int index = i + 1;

            sum += reverse * index;
        }

        return sum;
    }
}