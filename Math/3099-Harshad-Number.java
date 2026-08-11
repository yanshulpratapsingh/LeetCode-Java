/*
 * LeetCode: 3099. Harshad Number
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * First store the original number because x will be changed
 * while calculating the sum of its digits.
 *
 * Extract each digit using % 10 and add it to the sum.
 *
 * If the original number is divisible by the digit sum,
 * it is a Harshad number and we return the sum.
 * Otherwise, return -1.
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * d = number of digits in x
 */

class Solution {

    public int sumOfTheDigitsOfHarshadNumber(int x) {

        // Store the original number
        int org = x;

        int digit;
        int sum = 0;

        // Calculate the sum of digits
        while (x != 0) {

            digit = x % 10;
            sum = sum + digit;

            x = x / 10;
        }

        // Check whether the number is divisible by digit sum
        if (org % sum == 0) {
            return sum;
        }

        return -1;
    }
}