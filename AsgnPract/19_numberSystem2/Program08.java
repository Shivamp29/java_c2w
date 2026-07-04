/*
 *
 * 8. W AP to print the armstrong number in the user given range .
Input:
start: 1
end: 20
Output:
1, 2, 3, 4, 5, 6, 7, 8, 9
Armstrong number

it's a number where the sum of its own digits, each raised to the power of the number of digits, equals the
number itself.
For example, let's take the number 153:
The number of digits in 153 is 3.
1^3+5^3+3^3=1+125+27=153
153 is an armstrong number.*/


import java.util.Scanner;

class Program08 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = ip.nextInt();
        System.out.println("Enter the end number: ");
        int end = ip.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        boolean found = false;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong numbers found in this range.");
        }

        ip.close();
    }

    // Method to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        if (num < 0) return false;

        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num = num / 10;
        }

        return sum == originalNum;
    }

    // Method to count digits in a number
    static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
