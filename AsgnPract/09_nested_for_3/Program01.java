/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 * 		D D D D 
 * 		C C C C
 * 		B B B B
 * 		A A A A
 *
 */

import java.util.Scanner;

class Program01{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = row ; i >= 1 ; i--){
			for(int j = 1 ; j <= row ; j++){
				System.out.print((char)(64+i) + " ");
			}
			System.out.println();
		}
	
	}

}


