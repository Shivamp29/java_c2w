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
 *     		a	1	b
 *     			1	c
 *     				d
 *
 *     	Input : row = 4
 *
 *     		a	1	b	2
 *     			1	c	2
 *     				d	2
 *     					2
 *
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		char ch = 'a';
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					if(j % 2 == 0){
						System.out.print(j/2+"\t");
						
					}
					else{
						System.out.print(ch+"\t");
						ch++;
					}					
				}
			}
			System.out.println();
		}
	}
}
