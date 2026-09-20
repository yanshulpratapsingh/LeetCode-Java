// LeetCode: 1876. Substrings of Size Three with Distinct Characters
// Difficulty: Easy
// Topic: String / Sliding Window
// Approach: Check every substring of length 3 and verify that all three
//            characters are different.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for(int i = 0; i <= s.length() - 3; i++){

            // Check whether all 3 characters are distinct
            if(s.charAt(i) != s.charAt(i + 1)
             && s.charAt(i) != s.charAt(i + 2)
             && s.charAt(i + 1) != s.charAt(i + 2)){

                count++;
            }
        }

        return count;
    }
}