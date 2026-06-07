/*
 *
 *	Inverted Space Triangle :
 *
 *		* * * * 	space : sp <= i - 1;
 *	  	  * * * 	j loop : j <= row + 1 - i
 *          	    * *
 *            	      * 
 *
 *     	WAP to print the following pattern :
 *
 *     	Input : row = 3
 *     		
 *     		a	b	c
 *     			d	e
 *     				f
 *
 *     	Input : row = 4
 *
 *     		a	b	c	d
 *     			e	f	g
 *     				h	i
 *     					j
 *
 */

import java.util.Scanner;

class Program01{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		char ch = 'a';

		System.out.println("Method 1 : using 3 for loops : ");
		for(int i = 1; i <= row ; i++){
			for(int sp = 1; sp <= i-1 ; sp++){
				System.out.print("\t");
			}
			for(int j = 1 ; j <= row + 1 - i; j++){
				System.out.print(ch + "\t");
				ch++;
			}
			System.out.println();
		}

		System.out.println("Method 2 : using 2 for loops : ");
		ch = 'a';
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					System.out.print(ch+"\t");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
