/*Write a program to subtract one from each digit of a 4-digit number. If the digit is 0, it should
wrap around to` 9.
Example:
● Input: 3456
● Output: 2345
Additional Requirements:
● The input must always be a valid 4-digit number (i.e., between 1000 and 9999).
● The program should handle the wrap-around for 0 correctly. For instance, if the input is
1000, the output should be 9009*/

import java.util.*;

public class reduceone {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
            return;
        }

        int result = 0;
        int placeValue = 1;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            if (digit == 0) {
                digit = 9;
            } else {
                digit -= 1;
            }
            if(digit==0 && placeValue==1000){
                result+= 9*placeValue;
                continue;
            }
            result += digit * placeValue;
            placeValue *= 10;
        }


        System.out.println("Output: " + result);
    }
}
