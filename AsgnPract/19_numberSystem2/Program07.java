/*
 * W AP to print the Strong numbers in a user given range.
Input :
start:1
end:10
Output:
1, 2
Strong Number:
A Strong number is a number such that the sum of the factorials of its digits is equal to the number itself.
Take the number 145:
The factorial of 1 is
1!=1,
The factorial of 4 is
4!=4×3×2×1=24,
The factorial of 5 is
5!=5×4×3×2×1=120
Adding these factorials together,
1+24+120=145, which means 145 is a Strong number.*/


import java.util.Scanner;

class Program07 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = ip.nextInt();
        System.out.println("Enter the end number: ");
        int end = ip.nextInt();

        System.out.println("Strong numbers between " + start + " and " + end + ":");

        boolean found = false;
        for (int i = start; i <= end; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Strong numbers found in this range.");
        }

        ip.close();
    }

    // Method to check if a number is Strong
    static boolean isStrongNumber(int num) {
        if (num < 0) return false;

        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        return sum == originalNum;
    }

    // Method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
