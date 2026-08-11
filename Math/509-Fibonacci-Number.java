/*
 * LeetCode: 509. Fibonacci Number
 * Difficulty: Easy
 * Topic: Math / Dynamic Programming
 *
 * Approach:
 * Use an iterative approach to calculate the Fibonacci number.
 *
 * Keep track of the previous two Fibonacci numbers using
 * variables a and b. Calculate the next number and update
 * the values for the next iteration.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int fib(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        // Calculate Fibonacci numbers iteratively
        for (int i = 2; i <= n; i++) {

            c = a + b;

            // Move to the next pair
            a = b;
            b = c;
        }

        return c;
    }
}