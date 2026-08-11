/*
 * LeetCode: 412. Fizz Buzz
 * Difficulty: Easy
 * Topic: Array / String
 *
 * Approach:
 * Iterate from 1 to n and check the divisibility
 * conditions for each number.
 *
 * If the number is divisible by both 3 and 5,
 * add "FizzBuzz".
 *
 * If divisible only by 3, add "Fizz".
 * If divisible only by 5, add "Buzz".
 * Otherwise, add the number as a string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        // Process every number from 1 to n
        for (int i = 1; i <= n; i++) {

            // Divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }

            // Divisible by 3
            else if (i % 3 == 0) {
                result.add("Fizz");
            }

            // Divisible by 5
            else if (i % 5 == 0) {
                result.add("Buzz");
            }

            // Not divisible by 3 or 5
            else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}