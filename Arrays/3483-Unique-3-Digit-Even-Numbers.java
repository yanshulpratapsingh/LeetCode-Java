/*
 * LeetCode: 3483. Unique 3-Digit Even Numbers
 * Difficulty: Easy
 * Topic: Array / Brute Force / HashSet
 *
 * Approach:
 * Try every possible combination of three different indices.
 *
 * The first digit cannot be 0 because the number must be
 * a three-digit number.
 *
 * The last digit must be even because the number must be even.
 *
 * We also make sure that the same index is not used more than once.
 *
 * A HashSet is used to store the formed numbers so that duplicate
 * numbers are counted only once.
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(n^3) in the worst case
 */

import java.util.HashSet;

class Solution {
    public int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0 ; i<digits.length ; i++){
            for(int j=0 ; j<digits.length ; j++){
                for(int k=0 ; k<digits.length ; k++){

                    // Same digit copy cannot be used twice
                    if(i==j || j==k || k==i){
                        continue;
                    }

                    // First digit cannot be zero
                    if(digits[i]==0){
                        continue;
                    }

                    // Last digit must be even
                    if(digits[k]%2!=0){
                        continue;
                    }

                    // Form the three-digit number
                    int total = digits[i]*100 + digits[j]*10 + digits[k];

                    // HashSet removes duplicate numbers
                    set.add(total);
                }
            }
        }

        return set.size();
    }
}