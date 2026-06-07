/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		3 	b	1
 *		2	a
 *		1
 *
 *	Input : row = 4
 *		
 *		4	c	2 	a
 *		3	b	1
 *		2	a
 *		1
 *		
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){

			int num = row + 1 - i;
			for(int j = 1; j <= row + 1 - i ; j++){
				if(j % 2 == 0){
					System.out.print((char)(96+num) +"\t");
					num--;
				}
				else{			
					System.out.print(num + "\t");
					num--;
				}
			}
			System.out.println();
		}
	
	}
}
