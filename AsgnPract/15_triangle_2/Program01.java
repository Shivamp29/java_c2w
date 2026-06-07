/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		2 4
 *		3 6 9
 *
 *	Input : row = 4
 *
 *		1 
 *		2 4
 *		3 6 9
 *		4 8 12 16
 *
 */

import java.util.Scanner;

class Program01{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i  = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1 ; j <= i ; j++){
				System.out.print(num + "\t");
				num += i;
			}
			System.out.println();
		}
	}

}
