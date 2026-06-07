/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		2 	4 	6
 *		8 	10
 *		12
 *
 *	Input : row = 4
 *
 *		2 	4 	6	8
 *		10	12 	14
 *		16	18
 *		20
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int num = 2;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row + 1 - i ; j++){
				System.out.print(num + "\t");
				num+=2 ;
			}
			System.out.println();
		}
	
	}
}
