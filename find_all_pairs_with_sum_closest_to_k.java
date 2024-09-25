/*You are given an integer array arr[] and an integer k. Write a Java program that finds all
unique pairs of integers in the array such that their sum is closest to k without exceeding it. The
program should:
● Print all unique pairs whose sum is closest to k.
● If no such pairs exist, the program should output an appropriate message.*/


import java.util.*;
public class find_all_pairs_with_sum_closest_k {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 10};
        int k = 12;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        HashSet<String> unique = new HashSet<>();
        int diff = Integer.MAX_VALUE;
        int i = 0;
        int j = arr.length-1;
        while(i<j && arr[i]+arr[j]>k){
            j--;
        }
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum>k){
                j--;
                continue;
            }
            if(k-sum == diff){
                String str = "("+arr[i]+","+arr[j]+")";
                if(!unique.contains(str)){
                    list.add(Arrays.asList(arr[i],arr[j]));
                    unique.add(str);
                }
                i++;
            }else if(k-sum<diff){
                unique.clear();
                list.clear();
                diff = k-sum;
                String str = "("+arr[i]+","+arr[j]+")";
                unique.add(str);
                list.add(Arrays.asList(arr[i],arr[j]));
                i++;
            }
        }
        System.out.println(list);
    }
}
