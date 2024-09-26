/*Given an integer array nums and an integer target, find the contiguous subarray that sums up
to target. If such a subarray exists, return its start and end indices.
Task: Write a program that:
1. Accepts an integer array and an integer target as input.
2. Searches for a contiguous subarray whose sum equals target.
3. Returns the starting and ending indices of the subarray if found; otherwise, indicate that
no such subarray exists.*/

import java.util.Arrays;

public class Find_subarray_with_given_sum {
    public static int[] find(int[] arr,int target){
        int[] sum = new int[arr.length+1];
        sum[0] = 0;
        for(int i = 0;i<arr.length;i++){
            sum[i+1] = sum[i]+arr[i];
        }
        int i = 0;
        int j = 1;
        while(j<sum.length){
            int diff = sum[j]-sum[i];
            if(diff==target){
                int[] res2 = {i,j-1};
                i++;
                return res2;
            }else if(diff>target){
                i++;
            }else{
                j++;
            }
            if(i==j){
                j++;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {-5, -4, -2, -7};
        int target = -6;
        int[] res = find(arr,target);
        if(res.length==0){
            System.out.println("no value found");
        }else{
            System.out.println(Arrays.toString(res));
        }
    }
}
