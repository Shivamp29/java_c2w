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
 *	        3	5	7
 *	9	11	13	15	17	
 *
 *	Input : row  = 4
 *
 *				1
 *			3	5	7
 *		9 	11	13	15	17
 *	19	21	23	25	27	29	31
 *
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		

		int num = 1;
		for(int i = 1 ; i <= row ; i++){
			// space loop
			for(int sp = 1 ;  sp <= row - i; sp++){
				System.out.print("\t");
			}

			//pattern loop
			for(int j = 1 ; j <= i * 2 - 1 ; j++){
				System.out.print(num+"\t");
				num += 2;
			}
			System.out.println();

		}

	}

}
