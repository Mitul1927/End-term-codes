/*Given a positive number y, find the sum of all multiples of 6 or 10 that are less than or equal to y.
For example, if y=30, the multiples of 6 or 10 that are less than or equal to 30 are 6, 10, 12, 18,
20, 24, and 30. The sum of these multiples is 120.*/


public class sumofmultiplesof6or10 {
    public static void main(String[] args) {
        int num = 30;
        int prev = 6;
        int sum = 0;
        while(prev<=num){
            if(prev%6==0 || prev%10==0){
                sum+=prev;
            }
            prev+=2;
        }
        System.out.println(sum);
    }
}
