/*
 *
 * W AP to print whether the number is Automorphic number
Input: 25
Output:  25 is Automorphic
Automorphic Number
A number is automorphic if its square ends with the number itself.
The square of 25 is 625.
Since 25 appears at the end of 625, 25 is an automorphic number.*/

import java.util.Scanner;

class Program09 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = ip.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number");
            printAutomorphicDetails(num);
        } else {
            System.out.println(num + " is NOT an Automorphic number");
        }

        ip.close();
    }

    static boolean isAutomorphic(int num) {
        if (num < 0) return false;

        long square = (long) num * num;
        int digitCount = countDigits(num);
        long lastDigits = square % (long) Math.pow(10, digitCount);

        return lastDigits == num;
    }

    static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static void printAutomorphicDetails(int num) {
        long square = (long) num * num;
        int digitCount = countDigits(num);
        long lastDigits = square % (long) Math.pow(10, digitCount);
        System.out.println("Since " + lastDigits + " = " + num + ", it's Automorphic!");
    }
}
