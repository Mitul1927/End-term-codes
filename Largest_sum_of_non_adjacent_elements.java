/* Given an integer array nums, find the maximum sum of non-adjacent elements (elements that
are not next to each other in the array).
Task: Write a program that:
1. Accepts an integer array as input.
2. Calculates the maximum sum of non-adjacent elements.
3. Outputs the maximum sum and the elements contributing to this sum.*/

public class Largest_sum_of_non_adjacent_elements {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 10, 7};
        int sum  = 0;
        int sum2= 0;
        for(int num:nums){
            int dp = Math.max(sum,sum2+num);
            sum2 = sum;
            sum = dp;
        }
        System.out.println(sum);
    }
}
