/*
 * LeetCode: 258. Add Digits
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * Repeatedly calculate the sum of all digits until
 * the number becomes a single digit.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int addDigits(int num) {

        // Repeat until num becomes a single digit
        while (num > 9) {

            int sum = 0;
            int temp = num;

            // Calculate the sum of all digits
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            num = sum;
        }

        return num;
    }
}