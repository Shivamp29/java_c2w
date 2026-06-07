/*
 *      Inverted Pyramid :
 *			      
 *		* * * * * * *	Space loop : sp <= i - 1
 *		  * * * * *	int col = row * 2 - 1; // outside both the loop
 *		    * * *	patter loop : j <= col
 *		      * 	after j loop = col -= 2;
 *	
 *	WAP to print the following pattern : 
 *
 *	Input : row = 3
 *
 *	 	3	3	3	3	3	
 *	 	 	2	2	2
 *	 	 		1
 *	
 *	Input : row  = 4
 *
 *		4	4	4	4	4	4	4
 *			3	3	3	3	3
 *				2	2	2
 *					1
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int col = row * 2 - 1;
		int num = row;
		for(int i = 1 ; i <= row ; i++){
			for(int sp = 1 ; sp <= i-1 ; sp++){
				System.out.print("\t");
			}
			for(int j = 1 ; j<= col ; j++){
				System.out.print(num+"\t");
			}
			num--;
			col-= 2;
			System.out.println();
		}

	}

}
