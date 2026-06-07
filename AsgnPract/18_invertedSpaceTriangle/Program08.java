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
 *     		64	7	36
 *     			5	16	
 *     				9
 *
 *     	Input : row = 4
 *
 *     		100	9	64	7
 *     			6	25	4
 *     				9	2
 *     					1
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		int num = row + row + 2;
		for( int i = 1; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j<= i - 1){
					System.out.print("\t");
				}
				else{
					if(j % 2 == 0){
						System.out.print(num+"\t");
						num--;
					}
					else{
						System.out.print((num * num )+"\t");
						num--;
					}
				}
			}
			System.out.println();
		}
	}
}
