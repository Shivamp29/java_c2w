/*
 *	Pyramid :
 *			      
 *		      *		Space loop 	 : sp <= row - i
 *		    * * *	Pattern loop (j) : j <= i * 2 - 1
 *		  * * * * *
 *		* * * * * * * 	
 *	
 *	WAP to print the following pattern : 
 *
 *	Input : row = 3
 *
 *	          	1  
 *	        1	2	3
 *	1	2	3	4	5	
 *
 *	Input : row  = 4
 *
 *				1
 *			1	2	3
 *		1	2	3	4	5
 *	1	2	3	4	5	6	7
 *
 */

import java.util.Scanner;

class Program04{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		
		for(int i = 1 ; i <= row ; i++){
			// space loop
			for(int sp = 1 ;  sp <= row - i; sp++){
				System.out.print("\t");
			}

			//pattern loop
			for(int j = 1 ; j <= i * 2 - 1 ; j++){
				System.out.print(j+"\t");
			}
			System.out.println();

		}

	}

}
