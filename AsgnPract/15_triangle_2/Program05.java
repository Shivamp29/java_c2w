/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		A B
 *		1 2 3 
 *
 *	Input : row = 4
 *
 *		1 
 *		A B
 *		1 2 3
 *		A B C D
 *
 */

import java.util.Scanner;

class Program05{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i  = 1 ; i <= row ; i++){
			int num = 1;
			char  ch = 'A';
			for(int j = 1 ; j <= i ; j++){
				if(i % 2 == 0){
					System.out.print(ch + "\t");
					ch++;
				}
				else{
					System.out.print(num+"\t");
					num++;
				}
				
			}
			System.out.println();
		}
	}

}
