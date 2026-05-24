/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		1 2 3
 *		2 3 4
 *		3 4 5
 *
 * 	2. input row : 4
 *
 * 		1 2 3 4
 * 		2 3 4 5
 * 		3 4 5 6
 * 		4 5 6 7
 */

import java.util.Scanner;

class Program04{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	int num = 1 ;
	 for(int i = 1 ; i <= row ; i++){
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		num =  i+1;
	 }
	
	}

}
