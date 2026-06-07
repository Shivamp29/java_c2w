/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		2 c
 *		4 e 6
 *
 *	Input : row = 4
 *
 *		1
 *		2 c
 *		4 e 6
 *		7 h 9 j
 *
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		int num = 1;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1; j<= i ; j++){
				if(j % 2 == 0){
					System.out.print((char)(96 + num)+"\t");
					num++;
				}
				else{
					System.out.print(num + "\t");
					num++;
				}
			}
			System.out.println();
		}
	}

}
