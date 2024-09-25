import java.util.*;

public class findAllPairsWithProduct0 {
    public static void main(String[] args) {
        int[] nums = {5, 10, -10, -4, -2};
        int k = -20;
        List<List<Integer>> list = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums) {
            if (num != 0 && k % num == 0) {
                int complement = k / num;
                if (seen.contains(complement)) {
                    String str = "(" + Math.min(num, complement) + ", " + Math.max(num, complement) + ")";
                    if (!unique.contains(str)) {
                        unique.add(str);
                        list.add(0,Arrays.asList(Math.min(num,complement),Math.max(num,complement)));
                    }
                }
            }
            seen.add(num);
        }
        System.out.println(list);
    }
}
