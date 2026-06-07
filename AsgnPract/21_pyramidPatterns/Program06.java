/*
 *	WAP to print the following pattern :
 *
 *	Input : row = 3 
 *		
 *				3
 *			2	2	2	
 *		1	1	1	1	1
 *
 *	Input : row = 4
 *			
 *				4
 * 			3	3	3	
 * 		2	2	2	2	2	
 *	1	1	1	1	1	1	1	
 *
 */

import java.util.Scanner;

class Program06{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();
		int num = row;
		for(int i = 1 ; i<= row ; i++){
			for(int sp = 1; sp <= row - i ; sp++){
				System.out.print("\t");
			}
			for(int j = 1 ; j<= i * 2 - 1; j++){
				System.out.print(num + "\t");
			}
			num--;
			System.out.println();
		}
	}
}
