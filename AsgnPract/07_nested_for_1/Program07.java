/*
 *	WAP to print the following pattern
 *
 *      1. input row = 3
 *		3 2 1
 *		3 2 1
 *		3 2 1
 *
 *	2. input row = 4
 *		4 3 2 1
 *		4 3 2 1
 *		4 3 2 1
 *		4 3 2 1
 */

import java.util.Scanner;

class Program07{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no. of row : ");
		int row = ip.nextInt();

		int num = row;
		for(int i = 1 ; i <= row ; i++){
			num = row;
			for(int j = 1 ; j <= row ; j++){
			       	System.out.print( num + " ");
				num--;
			}
			System.out.println();
		}
	}

}
