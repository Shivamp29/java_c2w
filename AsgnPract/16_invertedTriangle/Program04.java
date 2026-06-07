/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		F	E	D
 *		C	B	
 *		A
 *
 *	Input : row = 4
 *
 *		J	I 	H	G
 *		F	E	D
 *		C	B
 *		A		
 */

import java.util.Scanner;

class Program04{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		char ch = (char)(64 + ((row * (row + 1))/2));
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row + 1 - i ; j++){
				System.out.print(ch + "\t");
				ch--;
			}
			System.out.println();
		}
	
	}
}
