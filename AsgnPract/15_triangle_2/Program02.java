/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		3
 *		2 4
 *		1 2 3
 *
 *	Input : row = 4
 *
 *		4
 *		3 6
 *		2 4 6
 *		1 2 3 4
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = row + 1 - i ;
			for(int j = 1 ; j <= i ; j++){
				System.out.print(num + "\t");
				num += row + 1 - i;
			}
			System.out.println();
		}
	}

}
