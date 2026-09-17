// LeetCode: 239. Sliding Window Maximum
// Difficulty: Hard
// Topic: Sliding Window / Monotonic Deque
// Approach: Maintain a decreasing deque of indices.
//            The front always contains the index of the maximum element
//            in the current sliding window.
// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices that are outside the current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            // because they can never become maximum
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Window is ready
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}