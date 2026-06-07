/*
 *	Space Triangle :
 *
 *	      *      Type 1 : 3 for loop
 *	    * *			space :  sp<= row - i
 *	  * * *			j loop : j <= i
 *	* * * *	     Type 2 : 2 for loop
 *				space : if( j <= row - i)
 *				pattern : else
 *
 * 	Innput : row = 3
 *
 * 			f
 * 		e	d
 * 	c	b	a
 *
 * 	Input : row = 4
 *
 * 				j
 * 			i	h
 * 		g	f	e
 * 	d	c	b	a
 *
 */

import java.util.Scanner;

class Program08{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		char ch = (char) ( 96+ ((row * (row + 1))/2));
		for( int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j <= row - i){
					System.out.print("\t");
				}
				else{
					System.out.print(ch+"\t");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
