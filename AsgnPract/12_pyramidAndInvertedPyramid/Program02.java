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
 *		  2 3 4
 *		5 6 7 8 9
 *
 *	Input : row  = 4
 *
 *				1
 *			2	3	4
 *		5 	6	7	8	9
 *	10	11	12	13	14	15	16
 *
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int num = 1;

		for( int i = 1 ; i <= row ; i++){
			// space 
			for(int sp = 1 ; sp <= row - i ; sp++){
				System.out.print("\t");
			}

			// pattern			
			for(int j = 1 ; j <= i * 2 - 1 ; j++){
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}

	}

}
