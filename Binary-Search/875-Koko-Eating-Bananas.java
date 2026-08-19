/*
 * LeetCode: 875. Koko Eating Bananas
 * Difficulty: Medium
 * Topic: Binary Search / Binary Search on Answer
 *
 * Approach:
 * The minimum possible eating speed is 1 and the maximum
 * possible speed is the largest pile.
 *
 * For every possible speed, calculate the total number of
 * hours required to finish all piles.
 *
 * If Koko can finish within h hours, try a smaller speed.
 * Otherwise, increase the speed.
 *
 * Since the required hours decrease as the eating speed
 * increases, we can use binary search.
 *
 * Time Complexity: O(n log m)
 * Space Complexity: O(1)
 *
 * where:
 * n = number of piles
 * m = maximum number of bananas in a pile
 */

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find the maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        // Binary search for the minimum valid eating speed
        while (left <= right) {

            int mid = left + (right - left) / 2;
            long hours = 0;

            // Calculate hours required at speed mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            // Speed is sufficient, try a smaller speed
            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            }

            // Speed is too slow, increase it
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
}