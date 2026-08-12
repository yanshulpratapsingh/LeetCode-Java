/*
 * LeetCode: 202. Happy Number
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * Replace the number with the sum of the squares of its digits
 * repeatedly.
 *
 * If the number becomes 1, it is a Happy Number.
 *
 * For every non-happy number, the process eventually enters
 * a cycle containing 4. Therefore, we stop when n becomes
 * either 1 or 4.
 *
 * Time Complexity: O(log n) per transformation
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isHappy(int n) {

        // Continue until n becomes 1 or enters the cycle at 4
        while (n != 1 && n != 4) {

            int sum = 0;

            // Calculate the sum of squares of all digits
            while (n > 0) {

                int digit = n % 10;
                sum = sum + digit * digit;

                n = n / 10;
            }

            // Move to the next number
            n = sum;
        }

        // n == 1 means the number is happy
        return n == 1;
    }
}