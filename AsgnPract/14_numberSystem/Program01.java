/*
 *	WAP to print the factors of the given number
 *
 *	INPUT : 12
 *		
 *		O/P : Factors of 12 are 1,2,3,4,6,12
 *
 *	INPUT : 11
 *
 *		O/P : Factors of 11 are 1 , 11
 *
 */

import java.util.Scanner;

class Program01{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1;

		System.out.println("Factors of "+num+" are");
		while(x <= num){
			if(num % x == 0){
				System.out.println(x);
			}
			x++;
		}
	}
}
