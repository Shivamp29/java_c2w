/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		12	10	8
 *		6	4
 *		2
 *
 *	Input : row = 4
 *
 *		20 	18 	16 	14
 *		12 	10	8
 *		6	4
 *		2
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int num =  row * (row + 1);
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row + 1 - i ; j++){
				System.out.print(num + "\t");
				num -= 2;
			}
			System.out.println();
		}
	
	}
}
