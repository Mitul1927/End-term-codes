import java.util.*;
public class CountFrequencyOfPairsWithDifferenceK {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 9, 2, 12, 3};
        int k = 2;
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int count = 0;
        Set<String> unique = new HashSet<>();
        while(j<arr.length){
            int diff = arr[j]-arr[i];
            if(diff==k){
                String pair = "("+arr[i]+","+arr[j]+")";
                if(!unique.contains(pair)){
                    unique.add(pair);
                    count++;
                }
                i++;
                j++;
            } else if(diff>k){
                i++;
            }else{
                j++;
            }
            if(i==j){
                j++;
            }
        }
        System.out.println(count);
    }
}
