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
 *     		A	b	C
 *     			D	e	
 *     				F
 *
 *     	Input : row = 4
 *
 *     		A	b 	C	d
 *     			E	f	G
 *     				H	i
 *     					J
 *
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		char ch = 'A';
		for( int i = 1; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j<= i - 1){
					System.out.print("\t");
				}
				else{
					if(i % 2 == 0){
						if(j % 2 == 0){
							System.out.print(ch+"\t");
							ch++;
						}
						else{
							System.out.print((char)(ch+32)+"\t");
							ch++;
						}
					}
					else{
						if( j % 2 == 0){
							System.out.print((char)(ch+32)+"\t");
							ch++;
						}
						else{
							System.out.print(ch+"\t");
							ch++;
						}
					}
				}
			}
			System.out.println();
		}
	}
}
