// LeetCode: 2535. Difference Between Element Sum and Digit Sum of an Array
// Difficulty: Easy
// Topic: Array / Mathematics / Digit Manipulation
// Approach: Calculate the element sum and extract every digit to calculate the digit sum.
// Time Complexity: O(n * d), where d is the number of digits in an element
// Space Complexity: O(1)

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sum1 = 0;

        for(int i : nums){
            // Element sum
            sum += i;

            // Digit sum
            if(i < 10){
                sum1 += i;
            }
            else{
                while(i > 0){
                    int digit = i % 10;
                    sum1 += digit;
                    i = i / 10;
                }
            }
        }

        return sum - sum1;
    }
}