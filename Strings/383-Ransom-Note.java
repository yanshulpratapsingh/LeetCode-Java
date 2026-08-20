/*
 * LeetCode: 383. Ransom Note
 * Difficulty: Easy
 * Topic: String / Frequency Array
 *
 * Approach:
 *
 * Create a frequency array of size 26 for lowercase English letters.
 *
 * First, count how many times each character appears in the magazine.
 *
 * Then traverse the ransomNote and decrease the frequency
 * of each required character.
 *
 * If the frequency of any character becomes negative,
 * it means the magazine does not contain enough of that character.
 *
 * In that case, return false.
 *
 * If all characters can be found, return true.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 *
 * n = length of ransomNote
 * m = length of magazine
 */

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count characters available in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Use characters required by ransomNote
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;

            // Not enough characters available
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}