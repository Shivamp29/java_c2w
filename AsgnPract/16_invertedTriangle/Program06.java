/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		1 	a	2
 *		1	a
 *		1
 *
 *	Input : row = 4
 *
 *		1	a 	2	b
 *		1	a	2
 *		1	a
 *		1
 */

import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			
			int num = 1;
			char ch = 'a';
			for(int j = 1; j <= row + 1 - i ; j++){
				if(j % 2 == 0){
					System.out.print(ch+"\t");
					ch++;
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
