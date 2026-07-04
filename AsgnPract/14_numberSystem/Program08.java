/*
 *	WAP to print the even digits and square of the odd digits 
 *
 *	INPUT : 16983265
 *		
 *		O/P : 25,6,2,9,8,81,6,1
 */

import java.util.Scanner;

class Program08{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = ip.nextInt();

		int x = 1; int sum = 0;
		int num1 = num;

		while(x <= num){
			int rem = num % 10;
			if(rem % 2 == 0){
				System.out.println(rem);
			}
			else{
				System.out.println(rem * rem);
			}
			num /= 10;			
		}
	}
}
