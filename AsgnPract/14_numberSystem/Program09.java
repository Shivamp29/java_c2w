/*
 *	WAP to print to reverse the given number
 *
 *	INPUT : 1234
 *		
 *		O/P : reverse of number 1234 is 4321
 */

import java.util.Scanner;

class Program09{

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

		System.out.println("Rev of number "+num1+" is "+rev);

	}
}
