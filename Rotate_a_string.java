/*Write a function that takes a string and an integer n, and rotates the string to the right by n
positions.
Example:
● Input: "abcdef", 2
● Output: "efabcd*/
import java.util.*;

public class RotateAString {
    public static void main(String[] args) {
        String str = "hello";
        int k = 3;
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(str.length()-k));
        sb.append(str.substring(0,str.length()-k));
        System.out.println(sb.toString());
    }
}
