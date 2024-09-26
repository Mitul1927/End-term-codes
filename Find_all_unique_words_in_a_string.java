/*Write a function that takes a string as input and returns a list of all unique words (case
insensitive) present in the string. Words are separated by space(s).
Example:
● Input: "Hello world hello"
● Output: ["hello", "world"]*/

import java.util.*;
public class FindAllUniqueWordsInAString {
    public static void main(String[] args) {
        String input = "hello world hello";
        String[] strarray = input.split(" ");
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(String str:strarray){
            if(!set.contains(str)){
                set.add(str);
                list.add(str);
            }
        }
        System.out.println(list);
    }
}
