// LeetCode: 134. Gas Station
// Difficulty: Medium
// Topic: Array / Greedy
// Approach: Track the total gas balance and the current tank balance.
// If the current tank becomes negative, the current start cannot be a valid
// starting point, so we start from the next station.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for(int i=0 ; i<gas.length ; i++){
            int gain = gas[i] - cost[i];

            // Total balance for the complete circuit
            total += gain;

            // Current balance from the chosen start
            tank += gain;

            // Current start cannot reach the next station
            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }

        // Not enough total gas to complete the circuit
        if(total < 0){
            return -1;
        }

        return start;
    }
}