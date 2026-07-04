/*
 *	WAP to print to check whether the given number is palindrome or not
 *
 *	INPUT : 12121
 *		
 *		O/P : palindrome number
 */

import java.util.Scanner;

class Program10{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int rev = 0;
		int num1 = num;

		while(x <= num){
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;			
		}

		System.out.println(num1 == rev ? "Palindrome Numner" : "Not a Palindrome Number");

	}
}
