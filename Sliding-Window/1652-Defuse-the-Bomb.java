// LeetCode: 1652. Defuse the Bomb
// Difficulty: Easy
// Topic: Sliding Window / Circular Array
// Approach: For every index, calculate the sum of the next k elements
//            when k is positive, or the previous -k elements when k is negative.
//            Use modulo arithmetic to handle the circular array.
// Time Complexity: O(n * |k|)
// Space Complexity: O(n) - for the result array

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        // If k is 0, every value becomes 0
        if(k == 0){
            return ans;
        }

        for(int i = 0; i < n; i++){

            // Sum of next k elements
            if(k > 0){
                for(int j = 1; j <= k; j++){
                    ans[i] += code[(i + j) % n];
                }
            }

            // Sum of previous -k elements
            else{
                for(int j = 1; j <= -k; j++){
                    ans[i] += code[(i - j + n) % n];
                }
            }
        }

        return ans;
    }
}