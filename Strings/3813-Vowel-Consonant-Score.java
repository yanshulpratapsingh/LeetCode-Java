/*
 * LeetCode: 3813. Vowel-Consonant Score
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Count vowels and consonants while traversing the string.
 * Ignore spaces and digits.
 * Return vowels / consonants if consonants exist.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1).
 */

class Solution {

    public int vowelConsonantScore(String s) {

        int vow = 0;
        int con = 0;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            // Count vowels
            if (s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                vow++;
            }

            // Count consonants and ignore digits/spaces
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                con++;
            }
        }

        // No consonants means score is 0
        if (con == 0) {
            return 0;
        }

        return vow / con;
    }
}