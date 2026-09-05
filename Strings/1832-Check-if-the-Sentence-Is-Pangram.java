/*
 * LeetCode: 1832. Check if the Sentence Is Pangram
 * Difficulty: Easy
 * Topic: String
 *
 * Approach:
 * Check every character from 'a' to 'z'.
 *
 * For each character, traverse the sentence and check
 * whether that character is present.
 *
 * If any character is missing, return false.
 * If all 26 characters are found, return true.
 *
 * Time Complexity: O(26 * n) = O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean checkIfPangram(String sentence) {

        // Check every alphabet character from 'a' to 'z'
        for(char chr='a' ; chr<='z' ; chr++){

            boolean found = false;

            // Search the current character in the sentence
            for(int j=0 ; j<sentence.length() ; j++){

                if(sentence.charAt(j)==chr){
                    found = true;
                }
            }

            // If any character is missing, it is not a pangram
            if(!found) return false;
        }

        return true;
    }
}