/*
 * W AP to print whether the number is Happy number
Input :  49
Output : 49 is a happy number
Happy number
A happy number is a positive integer that, when iteratively replaced by the sum of the squares of its digits,
eventually reaches 1.
Let’s Consider a number 10:
1^2 + 0^2 = 1
It’s a happy number*/

import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = ip.nextInt();
        
        if (isHappy(num)) {
            System.out.println(num + " is a Happy number");
        } else {
            System.out.println(num + " is NOT a Happy number");
        }
        
        ip.close();
    }
    
    static boolean isHappy(int num) {
        int slow = num;
        int fast = num;
        
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);
        
        return slow == 1;
    }
    
    static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }
        return sum;
    }
}
