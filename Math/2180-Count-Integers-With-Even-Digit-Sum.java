/*
 * LeetCode: 2180. Count Integers With Even Digit Sum
 * Difficulty: Easy
 * Topic: Math / Number
 *
 * Approach:
 * Check every positive integer from 1 to num.
 *
 * For each number, calculate its digit sum by repeatedly
 * extracting the last digit using % 10.
 *
 * If the digit sum is even, increase the count.
 *
 * Finally, return the total count of numbers having
 * an even digit sum.
 *
 * Time Complexity: O(n * d)
 * Space Complexity: O(1)
 *
 * n = given number
 * d = number of digits in each number
 */

class Solution {
    public int countEven(int num) {

        int count = 0;

        // Check every number from 1 to num
        for (int i = 1; i <= num; i++) {

            int n = i;
            int sum = 0;

            // Calculate digit sum
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            // Check whether digit sum is even
            if (sum % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}