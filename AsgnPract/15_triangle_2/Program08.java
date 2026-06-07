/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		2 A
 *		3 B 1
 *
 *	Input : row = 4
 *
 *		1
 *		2 A
 *		3 B 1
 *		4 C 2 A
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1 ; j <= i ; j++){
				if(j % 2 == 0){
					System.out.print((char)(64+num)+"\t");
					num--;
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
