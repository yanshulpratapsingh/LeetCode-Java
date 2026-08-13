/*
 * LeetCode: 122. Best Time to Buy and Sell Stock II
 * Difficulty: Medium
 * Topic: Arrays / Greedy
 *
 * Approach:
 * We can make multiple transactions, so whenever the
 * price increases from one day to the next, we take
 * that profit.
 *
 * For example:
 * [1, 5, 3, 6]
 *
 * Profit = (5 - 1) + (6 - 3)
 *        = 4 + 3
 *        = 7
 *
 * Adding every positive difference gives the maximum
 * possible profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;

        // Add every positive price difference
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}