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
 *	 	C	C	C	C	C
 *	 	 	B	B	B	
 *	 	 		A
 *	
 *	Input : row  = 4
 *
 *		D	D	D	D	D	D	D	
 *			C	C	C	C	C
 *				B	B	B	
 *					A
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		int col = row * 2 - 1;
		char ch = (char) (64+row);
		for(int i = 1 ; i <= row ; i++){
			for(int sp = 1 ; sp <= i-1 ; sp++){
				System.out.print("\t");
			}
			for(int j = 1 ; j<= col ; j++){
				System.out.print(ch+"\t");
			}
			ch--;
			col-= 2;
			System.out.println();
		}

	}

}
