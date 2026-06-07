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
 *	          	A 
 *	        a 	b	c
 *	A	B 	C	D 	E	
 *
 *	Input : row  = 4
 *
 *				A
 *			a 	b	c
 *		A 	B	C	D	E
 *	a	b	c	d	e	f	g
 *
 */

import java.util.Scanner;

class Program05{
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
				if( i % 2 == 0 ){
					System.out.print((char)(96+j)+"\t");
				}
				else{
					System.out.print((char)(64+j)+"\t");
				}
			}
			System.out.println();

		}

	}

}
