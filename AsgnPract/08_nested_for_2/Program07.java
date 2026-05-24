/*
 *	WAP To print the following pattern
 *	1. input row : 4
 *
 *		 1 3 5 7
 *		 2 4 6 8
 *		 3 5 7 9
 *		 4 6 8 10
 *
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	 for(int i = 1 ; i <= row ; i++){
		 int num = i;
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print(num+" ");
			num = num + 2;
		}
		System.out.println();
	 }
	
	}

}
