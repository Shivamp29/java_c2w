/*
 *	WAP to print the following pattern :
 *
 *	Input : row = 3 
 *		
 *				2
 *			3 	5	7	
 *		11	13	15	17
 *
 *	Input : row = 4
 *			
 *				2
 *			3	5	7	
 * 		11	13	17	19	23
 * 	29	31	37	41	43	47	53	
 *
 */

import java.util.Scanner;

class Program01{

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
