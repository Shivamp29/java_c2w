/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 * 		1 2 3  4
 * 		2 4 6  8 
 * 		3 6 9  12
 * 		4 8 12 16
 *
 */

import java.util.Scanner;

class Program04{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1 ; j <= row ; j++){
				System.out.print(num + " ");
				num += i;
			}
			System.out.println();
		}
	
	}

}


