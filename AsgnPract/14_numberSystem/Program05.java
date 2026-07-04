/*
 *	WAP to print the digits from the give number
 *
 *	INPUT : 7835
 *		
 *		O/P : 	3
 *			5
 *			8
 *			7
 *
 */

import java.util.Scanner;

class Program05{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1;

		while(x <= num){
			int rem = num % 10;
			System.out.println(rem);
			num /= 10;			
		}

	}
}
