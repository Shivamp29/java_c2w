/*
 *	Pyramid :
 *			      
 *		      *		Space loop 	 : sp <= i-1
 *		    * * *	Pattern loop (j) : j <= i * 2 - 1
 *		  * * * * *
 *		* * * * * * * 	
 *	
 *	WAP to print the following pattern : 
 *
 *	Input : row = 3
 *
 *	            1  
 *		  1 1 1
 *		1 1 1 1 1
 *
 *	Input : row  = 4
 *
 *		      1
 *		    1 1 1
 *		  1 1 1 1 1
 *		1 1 1 1 1 1 1
 *
 */

import java.util.Scanner;

class Program01{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		System.out.println("Structur of Pyramid : ");
		for(int i = 1 ; i <= row ; i++){
			// space loop
			for(int sp = 1 ; sp <= row - i ; sp++){
				System.out.print("\t");
			}

			// pattern loop
			for(int j = 1 ; j <= i * 2 - 1 ; j++){
				System.out.print("* \t");
			}
			System.out.println();
		}

		System.out.println("Patter pyramid : ");
		for(int i = 1 ; i <= row ; i++){
			// space 
			for(int sp = 1 ; sp <= row - i ; sp++){
				System.out.print("\t");
			}
			
			// pattern
			for(int j = 1; j <= i * 2 -1; j++){
				System.out.print("1 \t");
			}
			System.out.println();
		}

	}

}
