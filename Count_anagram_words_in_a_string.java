/*Write a function that, given a string, counts and returns the number of words that are anagrams
of a given word. A word in a string is separated by space(s).
Example:
● Input: "listen silent enlist hello"
● Anagram Word: "listen"
● Output: 3 (the words "listen," "silent," and "enlist" are anagrams of each other)*/

import java.util.*;

public class Count_anagram_word_in_a_string {
    public static boolean ValidAnagram(String s, HashMap<Character,Integer> map){
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch:s.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        return map.equals(map2);
    }
    public static void main(String[] args) {
        String str = "listen silent enlist hello";
        String anagram = "listen";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:anagram.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String[] strarr = str.split(" ");
        int count  = 0;
        for(String st:strarr){
            if(ValidAnagram(st,map)){
                count++;
            }
        }
        System.out.println(count);
    }
}
