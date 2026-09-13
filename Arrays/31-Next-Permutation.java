// LeetCode: 31. Next Permutation
// Difficulty: Medium
// Topic: Array / Two Pointer
// Approach: Find the pivot, find the next greater element, swap them, then reverse the suffix.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {

        // Find pivot
        int pivot = -1;
        for(int i=nums.length-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        // No pivot found then reverse array
        if(pivot==-1){
            int l=0;
            int r=nums.length-1;

            while(l<r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            return;
        }

        // Find the element just larger than nums[pivot]
        int replace = -1;
        for(int i=nums.length-1 ; i>pivot ; i--){
            if(nums[pivot]<nums[i]){
                replace = i;
                break;
            }
        }

        // Swap pivot and replace
        int tmp = nums[pivot];
        nums[pivot] = nums[replace];
        nums[replace] = tmp;

        // Reverse the part after pivot
        int l = pivot+1;
        int r = nums.length-1;

        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}