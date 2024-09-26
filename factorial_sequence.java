/*A company is creating a tool for calculating factorial values defined as:
● F(0) = 1
● F(n) = n * F(n-1) for n > 0
Task: Write a Java program that:
1. Accepts a positive integer num as input from the user.
2. Displays the factorial of num.
3. Displays all factorial values from F(0) to F(num).
4. Handles invalid inputs appropriately.
*/

import java.util.*;

public class factorial_sequence {
    public static int fact(int num,List<Integer> list){
        if(num==1){
            list.add(num);
            return 1;
        }
        int num2 = num*fact(num-1,list);
        list.add(num2);
        return num2;
    }
    public static void main(String[] args) {
        int num = 4;
        List<Integer> list = new ArrayList<>();
        int factorial = fact(num,list);
        System.out.println("factorial of number "+num+" = "+list.get(list.size()-1));
        System.out.println("factorials from 0 to "+num +" = "+list);
    }
}
