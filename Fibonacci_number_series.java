/*A company is developing a tool to generate terms of the Fibonacci Number
Series, defined as:
● F(0) = 0
● F(1) = 1
● F(n) = F(n-1) + F(n-2) for n > 1
Task: Write a Java program that:
1. Accepts a positive integer num as input from the user.
2. Displays the numth Fibonacci number.
3. Displays all Fibonacci numbers up to the numth term.
4. Handles invalid inputs by prompting the user for a valid positive number*/

import java.util.*;

public class FibonacciNumberSerires {
    public static void main(String[] args) {
        List<Integer> list   = new ArrayList<>();
        int n = 4;
        int a = 0;
        int b = 1;
        list.add(1);
        int i = 1;
        while(i<n){
            int c = a+b;
            list.add(c);
            b=c;
            a=b;
            i++;
        }
        System.out.println("nth fibonacci number is "+b);
        System.out.println("all fibonacci until n is "+list);
    }
}
