/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		3	2	1
 *		B	A
 *		1
 *		
 *	Input : row = 4
 *
 *		4	3	2	1
 *		C	B	A
 *		2	1
 *		A
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){

			int num = row + 1 - i;
			for(int j = 1; j <= row + 1 - i ; j++){
				if(i % 2 == 0){
					System.out.print((char)(64+num)+"\t");
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
