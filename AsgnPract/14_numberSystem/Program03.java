/*
 *	WAP to print the given number is composit or not
 *
 * 	Composit number : a number whose factors are more than 2 
 *
 *	INPUT : 12
 *		
 *		O/P : 12 is composit number
 *
 *	INPUT : 7
 *
 *		O/P : 7 is prime number
 *
 */

import java.util.Scanner;

class Program03{

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

		System.out.println(count == 2 ? num +" is prime number" : num + " is Composite number");
	}
}
