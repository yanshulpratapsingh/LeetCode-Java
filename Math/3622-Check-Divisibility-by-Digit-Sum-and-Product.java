/*
 * LeetCode: 3622. Check Divisibility by Digit Sum and Product
 * Difficulty: Easy
 * Topic: Math / Digit Manipulation
 *
 * Approach:
 * Extract each digit of n using % 10.
 *
 * Calculate two values:
 * 1. Sum of all digits
 * 2. Product of all digits
 *
 * Add the digit sum and digit product.
 * If n is divisible by this value, return true.
 * Otherwise, return false.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean checkDivisibility(int n) {

        int org = n;
        int sum = 0;
        int product = 1;

        // Calculate digit sum and digit product
        while (n > 0) {

            int digit = n % 10;

            sum += digit;
            product *= digit;

            n /= 10;
        }

        // Required divisor = digit sum + digit product
        int ans = sum + product;

        return org % ans == 0;
    }
}