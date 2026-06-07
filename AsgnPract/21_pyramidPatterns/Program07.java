/*
 *	WAP to print the following pattern :
 *
 *	Input : row = 3 
 *		
 *				C
 *			B	C	B	
 *		A	B	C	B	A
 *
 *	Input : row = 4
 *			
 *				D
 * 			C	D	C	
 * 		B	C	D	C	B	
 *	A	B	C	D	C	B	A	
 *
 */

import java.util.Scanner;

class Program07{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();
		for(int i = 1 ; i<= row ; i++){
			for(int sp = 1; sp <= row - i ; sp++){
				System.out.print("\t");
			}
			char ch = (char) (65 + row - i);
			for(int j = 1 ; j<= i * 2 - 1; j++){
				if( j  < i){
					System.out.print(ch+"\t");
					ch++;
				}
				else{
					System.out.print(ch + "\t");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
