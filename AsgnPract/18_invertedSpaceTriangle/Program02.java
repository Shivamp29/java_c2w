/*
 *
 *	Inverted Space Triangle :
 *
 *		* * * * 	METHOD 1 : 	space : sp <= i - 1;
 *	  	  * * * 			j loop : j <= row + 1 - i
 *          	    * *		METHOD 2 : 	if(j <= i-1) -> space
 *            	      * 			else 	     -> pattern
 *
 *     	WAP to print the following pattern :
 *
 *     	Input : row = 3
 *     		
 *     		1	B	3
 *     			B	3
 *     				3
 *
 *     	Input : row = 4
 *
 *     		1	B	3	D
 *     			B	3	D
 *     				3	D
 *     					D
 *
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		char ch = 'a';

		System.out.println("Method 1 : using 3 for loops : ");
		for(int i = 1; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					if(j % 2 == 0){
						System.out.print((char)(64+j)+"\t");
					}
					else{
						System.out.print(j+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}
