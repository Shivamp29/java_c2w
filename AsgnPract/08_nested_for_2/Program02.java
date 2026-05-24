/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *		1  4  9
 *		16 25 36
 *		49 64 81
 *
 *
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	 int num = 1;
	 for(int i = 1 ; i <= row ; i++){
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print((num * num)+" ");
			num++;
		}
		System.out.println();
	 }
	
	}

}
