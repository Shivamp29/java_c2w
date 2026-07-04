/*
 *	WAP to print the sum of even digits from the give number
 *
 *	INPUT : 942111423
 *		
 *		O/P : sum of even digits of 942111423 is : 12
 */

import java.util.Scanner;

class Program07{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int sum = 0;
		int num1 = num;

		while(x <= num){
			int rem = num % 10;
			if(rem % 2 == 0){
				sum = sum + rem;
			}
			num /= 10;			
		}

		System.out.println("Sum of even digits in "+num1+" is "+sum);

	}
}
