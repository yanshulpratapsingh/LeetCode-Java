/*
 * LeetCode: 3870. Count Commas in Range
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * Numbers from 1 to 999 do not contain any comma.
 *
 * Starting from 1000, every number contains exactly one comma
 * for the given problem constraints.
 *
 * Therefore, the total number of commas is:
 *
 * n - 999
 *
 * If n is less than 1000, there are no commas.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public int countCommas(int n) {

        // Numbers below 1000 do not contain commas
        if(n<1000){
            return 0;
        }

        // Every number from 1000 to n contributes one comma
        return n-999;
    }
}