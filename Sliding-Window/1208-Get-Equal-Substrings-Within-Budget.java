/*
 * LeetCode: 1208. Get Equal Substrings Within Budget
 * Difficulty: Medium
 * Topic: Sliding Window
 *
 * Approach:
 * Maintain a sliding window using two pointers: left and right.
 *
 * For every character, calculate the cost of changing s[i]
 * to t[i] using the absolute difference of their ASCII values.
 *
 * Add this cost to the current window cost.
 *
 * If the current cost exceeds maxCost, move the left pointer
 * forward and subtract the cost of the removed character until
 * the window becomes valid again.
 *
 * For every valid window, update the maximum length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int left = 0;
        int max = 0;
        int currCost = 0;

        for(int right=0 ; right<s.length() ; right++){

            // Add cost of changing s[right] to t[right]
            currCost += Math.abs(s.charAt(right) - t.charAt(right));

            // Shrink window if cost exceeds the budget
            while(currCost > maxCost){
                currCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            // Update maximum valid window length
            max = Math.max(max, right-left+1);
        }

        return max;
    }
}