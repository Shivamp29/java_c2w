/*
 *	WAP to print the following pattern :
 *
 *	Input : row = 3 
 *		
 *				A
 *			B	B	B	
 *		C	C	C	C	C
 *
 *	Input : row = 4
 *			
 *				A
 * 			B	B	B	
 * 		C	C	C	C	C	
 *	D	D	D	D	D	D	D	
 *
 */

import java.util.Scanner;

class Program02{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();
	
		for(int i = 1 ; i<= row ; i++){
			for(int sp = 1; sp <= row - i ; sp++){
				System.out.print("\t");
			}
			
			for(int j = 1 ; j<= i * 2 - 1; j++){
				System.out.print((char)(64+i) + "\t");
			}
			System.out.println();
		}
	}
}
