/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		A 	B	C
 *		a	b
 *		A
 *
 *	Input : row = 4
 *
 *		A 	B	C	D
 *		a	b	c
 *		A	B
 *		a
 */

import java.util.Scanner;

class Program05{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			
			for(int j = 1; j <= row + 1 - i ; j++){
				
				if(i % 2 == 0){
					System.out.print((char)(96+j)+"\t");
				}
				else {
					System.out.print((char)(64+j)+"\t");
				}
			}
			System.out.println();
		}
	
	}
}
