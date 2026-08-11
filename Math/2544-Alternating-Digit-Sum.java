/*
 * LeetCode: 2544. Alternating Digit Sum
 * Difficulty: Easy
 * Topic: Math / String
 *
 * Approach:
 * Convert the number into a string and process each digit.
 *
 * Digits at even indices are added because the most
 * significant digit has a positive sign.
 *
 * Digits at odd indices are subtracted.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(d)
 *
 * d = number of digits in n
 */

class Solution {

    public int alternateDigitSum(int n) {

        String s = String.valueOf(n);
        int sum = 0;

        // Process each digit with alternating signs
        for (int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            // Even index → positive sign
            if (i % 2 == 0) {
                sum += digit;
            }

            // Odd index → negative sign
            else {
                sum -= digit;
            }
        }

        return sum;
    }
}