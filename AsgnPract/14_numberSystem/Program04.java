/*
 *	WAP to print the factorial of the give number
 *
 *	INPUT : 6
 *		
 *		O/P : a factorial of 6 is 720
 *
 */

import java.util.Scanner;

class Program04{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int fact = 1;

		while(x <= num){
			fact = fact * x;
			x++;
		}

		System.out.println("factorial of "+num+" is : "+fact);
	}
}
