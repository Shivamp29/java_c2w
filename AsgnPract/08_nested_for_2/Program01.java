/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		1 2 3
 *		3 4 5
 *		4 5 6
 *
 * 	2. input row : 4
 *
 * 		1  2  3  4
 * 		4  5  6  7
 * 		7  8  9  10
 * 		10 11 12 13
 *
 */

import java.util.Scanner;

class Program01{
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
		num =  num - 1;
	 }
	
	}

}
