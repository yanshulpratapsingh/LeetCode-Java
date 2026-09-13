// LeetCode: 1283. Find the Smallest Divisor Given a Threshold
// Difficulty: Medium
// Topic: Binary Search
// Approach: Binary search for the smallest divisor between 1 and the maximum
// element. For each divisor, calculate the sum using ceiling division.
// Time Complexity: O(n log(max(nums)))
// Space Complexity: O(1)

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        // Find the maximum element
        for(int num : nums){
            right = Math.max(right, num);
        }

        while(left < right){
            int mid = left + (right-left) / 2;
            int sum = 0;

            // Calculate the sum using ceiling division
            for(int num : nums){
                sum += (num + mid - 1) / mid;
            }

            // mid is a possible answer, search for smaller divisor
            if(sum <= threshold){
                right = mid;
            }
            else{
                // mid is too small
                left = mid + 1;
            }
        }

        return left;
    }
}