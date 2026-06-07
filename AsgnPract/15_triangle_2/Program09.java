/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		1 2
 *		2 3 4
 *
 *	Input : row = 4
 *
 *		1
 *		1 2
 *		2 3 4
 *		4 5 6 7
 *
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		int num = 1;
		for(int i = 1 ; i <= row ; i++){
			
			for(int j = 1 ; j <= i ; j++){
				System.out.print(num+"\t");
				num++;	
			}
			num -= 1;
			System.out.println();
		}
	}
}
