/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 * 		1 5 9  13
 * 		2 6 10 14
 * 		3 7 11 15
 * 		4 8 12 16
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
	
			int num = i;
			for(int j = 1 ; j <= row ; j++){
				System.out.print(num + " ");
				num += row;
			}
			System.out.println();
		}
	
	}

}


