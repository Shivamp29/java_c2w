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
 *	 	2 	4	6	8	10
 *	 	 	12	14	16
 *	 	 		18
 *	
 *	Input : row  = 4
 *
 *		2 	4	6	8	10	12	14
 *			16	18	20	22	24
 *				26	28	30
 *					32
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int col = row * 2 - 1;
		int num = 2;
		for(int i = 1 ; i <= row ; i++){
			for(int sp = 1 ; sp <= i-1 ; sp++){
				System.out.print("\t");
			}
			for(int j = 1 ; j<= col ; j++){
				System.out.print(num+"\t");
				num+=2;
			}
			col-= 2;
			System.out.println();
		}

	}

}
