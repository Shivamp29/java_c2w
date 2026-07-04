/*
 *	WAP to print the given number is prime or not
 *
 *	INPUT : 12
 *		
 *		O/P : 12 is not a prime no
 *
 *	INPUT : 7
 *
 *		O/P : 7 is prime number
 *
 */

import java.util.Scanner;

class Program02{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int count = 0;

		while(x <= num){
			if(num % x == 0){
				count ++;
			}
			x++;
		}

		System.out.println(count == 2 ? num +" is prime number" : num + " is not prime number");
	}
}
