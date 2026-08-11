/*
 * LeetCode: 2894. Divisible and Non-divisible Sums Difference
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * Iterate from 1 to n.
 *
 * If a number is divisible by m, add it to num2.
 * Otherwise, add it to num1.
 *
 * Finally, return num1 - num2 as required.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int differenceOfSums(int n, int m) {

        int num1 = 0; // Sum of non-divisible numbers
        int num2 = 0; // Sum of divisible numbers

        // Check every number from 1 to n
        for (int i = 1; i <= n; i++) {

            if (i % m == 0) {
                // Number is divisible by m
                num2 += i;
            }
            else {
                // Number is not divisible by m
                num1 += i;
            }
        }

        // Required answer: non-divisible sum - divisible sum
        return num1 - num2;
    }
}