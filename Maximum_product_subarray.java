/*Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest product and return that product.
Task: Write a program that:
1. Accepts an integer array as input.
2. Calculates and returns the maximum product of any contiguous subarray.
3. Handles edge cases, such as arrays with negative numbers and zeros.*/

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        int n = nums.length;
        for(int i = 1;i<n;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i],max*nums[i]);
            min = Math.min(nums[i],min*nums[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
