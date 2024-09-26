/*Write a program that takes a string as input and reverses each word in the string while
maintaining the original order of the words.
Example:
● Input: "Hello World"
● Output: "olleH dlroW"
*/

import java.util.*;
public class reverse_each_word_in_a_string {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st : strArray){
            for(int j=st.length()-1;j>=0;j--){
                sb.append(st.charAt(j));
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
