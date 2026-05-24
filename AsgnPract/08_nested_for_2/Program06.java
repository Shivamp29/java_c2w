/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		3 6 9
 *		2 5 8
 *		1 4 7
 *
 * 	2. input row : 4
 *
 * 		4 8 12 16
 * 		3 7 11 15
 * 		2 6 10 14
 * 		1 5 9 13
 *
 */

import java.util.Scanner;

class Program06{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	int num = row ;
	 for(int i = 1 ; i <= row ; i++){
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print(num+" ");
			num = num + row;
		}
		System.out.println();
		num =  row - i;
	 }
	
	}

}
