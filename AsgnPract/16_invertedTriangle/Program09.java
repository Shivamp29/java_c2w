/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		c 	b	a
 *		B	A
 *		a
 *		
 *	Input : row = 4
 *
 *		D	C	B	A
 *		c	b	a
 *		B	A
 *		a
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = row + 1 - i;
			for(int j = 1; j <= row + 1 - i ; j++){
				if(row % 2 == 0){
					if(i % 2 == 0){
						System.out.print((char)(96+num)+"\t");
						num--;
					}
					else{
						System.out.print((char)(64+num)+"\t");
						num--;
					}
				}
				else{	
					if(i % 2 == 0){
						System.out.print((char)(64+num) + "\t");
						num--;
					}
					else{
						System.out.print((char)(96+num)+"\t");
						num--;
					}
				}
			}
			System.out.println();
		}
	
	}
}
