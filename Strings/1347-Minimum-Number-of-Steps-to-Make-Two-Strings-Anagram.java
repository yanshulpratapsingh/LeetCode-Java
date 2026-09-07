/*
 * LeetCode: 1347. Minimum Number of Steps to Make Two Strings Anagram
 * Difficulty: Medium
 * Topic: String / Frequency Counting
 *
 * Approach:
 * Use a frequency array of size 26.
 *
 * For every character:
 * - Increase its count for string s.
 * - Decrease its count for string t.
 *
 * After processing both strings:
 * Positive values represent characters that are extra in s
 * and need to replace characters in t.
 *
 * Sum all positive values to get the minimum number of steps.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minSteps(String s, String t) {

        int [] count = new int[26];

        // Count characters of s and subtract characters of t
        for(int i=0 ; i<s.length() ; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        int step = 0;

        // Count characters that are missing in t
        for(int c : count){
            if(c>0){
                step += c;
            }
        }

        return step;
    }
}