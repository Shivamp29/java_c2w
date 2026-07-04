/*
 *	WAP to print the sum of digits from the give number
 *
 *	INPUT : 942111423
 *		
 *		O/P : sum of digits is : 27
 */

import java.util.Scanner;

class Program06{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int sum = 0;

		while(x <= num){
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;			
		}

		System.out.println("Sum of digits is : "+sum);

	}
}
