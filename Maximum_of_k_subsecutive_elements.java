/*Given an integer array nums and an integer k, find the maximum sum of any contiguous
subarray of size k.
Task: Write a program that:
1. Accepts an integer array and an integer k as input.
2. Calculates and returns the maximum sum of any contiguous subarray of size k.
3. Handles edge cases, such as when k is larger than the size of the array.
*/


import java.util.*;

public class maximum_sum_of_k_consecutive_elements {
    public static int pro(int k, int[] nums){
        if(k==0 || k>nums.length){
            return -1;
        }
        if(k==1){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int[] sum = new int[nums.length+1];
        sum[0] = 0;
        for(int i = 0;i<nums.length;i++){
            sum[i+1] = sum[i]+nums[i];
        }
        int res = sum[k];
        for(int i = 1;i<sum.length-k;i++){
            int j = i+k;
            res = Math.max(res,sum[j]-sum[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int k = 4;
        int[] nums = {1, 2, 3, 4};
        int product  = pro(k,nums);
        System.out.println(product);
    }
}
