// LeetCode: 2108. Find First Palindromic String in the Array
// Difficulty: Easy
// Topic: String / Two Pointer
// Approach: Traverse each word and use two pointers to check whether it is a palindrome.
// Return immediately when the first palindrome is found.
// Time Complexity: O(n * m), where n is number of words and m is average word length
// Space Complexity: O(1)

class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int left = 0;
            int right = word.length()-1;
            boolean palindrome = true;

            while(left<right){
                if(word.charAt(left) != word.charAt(right)){
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if(palindrome){
                return word;
            }
        }

        return "";
    }
}