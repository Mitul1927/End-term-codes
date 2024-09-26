/*Write a program that, given a string, replaces the first and last character of each word with a
specified character.
Complete the function replaceFirstLastChar() that accepts a multi word string and a character,
replacing the first and last character of every word in it with the specified character.
Note: Every two adjacent words in the given string will be separated by exactly one space
character.
Example:
● Input: "Hello World", *
● Output: "*ell* *orl*"*/

public class Replace_first_and_last_character_of_each_word_in_a_string {
    public static void main(String[] args) {
        String str = "Hello World";
        Character ch = '*';
        StringBuilder sb = new StringBuilder();
        for(String s:str.split(" ")){
            sb.append(ch).append(s.substring(1,s.length()-1)).append(ch).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
