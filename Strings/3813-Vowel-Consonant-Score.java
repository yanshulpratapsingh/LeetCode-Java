/*
 * LeetCode: 3813. Vowel-Consonant Score
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Count the number of vowels and consonants in the string.
 * Spaces and digits are ignored.
 * If there are no consonants, return 0.
 * Otherwise, return vowels / consonants.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int vowelConsonantScore(String s) {

        int vow = 0;
        int con = 0;

        // Traverse each character of the string
        for (int i = 0; i < s.length(); i++) {

            // Check whether the character is a vowel
            if (s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                vow++;
            }

            // Count only lowercase English letters as consonants
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                con++;
            }
        }

        // Avoid division by zero
        if (con == 0) {
            return 0;
        }

        // Integer division gives floor(vow / con)
        int score = vow / con;

        return score;
    }
}