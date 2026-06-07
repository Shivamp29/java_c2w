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
 *     		9	8	7
 *     			6	5
 *     				4
 *
 *     	Input : row = 4
 *
 *     		16	15	14	13
 *     			12	11	10
 *     				9	8
 *     					7
 *
 */

import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		
		int num = row * row;
		for( int i = 1; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j<= i - 1){
					System.out.print("\t");
				}
				else{
					System.out.print(num+"\t");
						num--;
				}
			}
			System.out.println();
		}
	}
}
