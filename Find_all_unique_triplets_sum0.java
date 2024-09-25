import java.util.*;
public class FindAlluniqueTripletsWithSum0 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            int k = i+1;
            int j = arr.length-1;
            while(k<j){
                int ans = arr[i]+arr[j]+arr[k];
                if(ans==0){
                    list.add(Arrays.asList(arr[i],arr[k],arr[j]));
                    k++;
                    while(j<k && arr[j]==arr[j-1]){
                        k++;
                    }
                }else if(ans<0){
                    k++;
                }else{
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
