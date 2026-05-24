/*
 *	WAP to print the following pattern
 *
 *      1. input row = 3
 *		1 2 3
 *		1 2 3
 *		1 2 3
 *
 *	2. input row = 4
 *		1 2 3 4
 *		1 2 3 4
 *		1 2 3 4
 *		1 2 3 4
 */

import java.util.Scanner;

class Program06{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no. of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
			       	System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
