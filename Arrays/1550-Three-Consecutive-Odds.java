/*
 * LeetCode: 1550. Three Consecutive Odds
 * Difficulty: Easy
 * Topic: Array
 *
 * Approach:
 * Traverse the array and maintain a count of consecutive odd numbers.
 *
 * If the current number is odd, increase the count.
 *
 * If the current number is even, reset the count to 0 because
 * the consecutive sequence of odd numbers is broken.
 *
 * If the count reaches 3, return true.
 *
 * If the complete array is traversed without finding three
 * consecutive odd numbers, return false.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;

        for(int i=0 ; i<arr.length ; i++){

            // Count consecutive odd numbers
            if(arr[i]%2==1){
                count++;
            }
            else{
                // Reset when an even number is found
                count = 0;
            }

            // Three consecutive odd numbers found
            if(count>=3) return true;
        }

        return false;
    }
}