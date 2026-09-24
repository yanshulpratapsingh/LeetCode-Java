// LeetCode: 3550. Smallest Index With Digit Sum Equal to Index
// Difficulty: Easy
// Topic: Mathematics / Digit Manipulation
// Approach: For each index, calculate the digit sum of nums[i] and
//            check whether it is equal to the current index.
//            Return the first matching index.
// Time Complexity: O(n * d), where d is the number of digits
// Space Complexity: O(1)

class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int n = nums[i];

            // Handle single-digit number
            if (n < 10) {

                if (i == nums[i]) {
                    return nums[i];
                }

            } else {

                // Calculate digit sum
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }

                // Check digit sum with index
                if (sum == i) {
                    return i;
                }
            }
        }

        return -1;
    }
}