/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		c
 *		3 2
 *		c b a
 *
 *	Input : row = 4
 *
 *		d
 *		4 3
 *		d c b
 *		4 3 2 1
 *
 */

import java.util.Scanner;

class Program04{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i  = 1 ; i <= row ; i++){
			int num = row;
			char ch = (char) (64 + row);
			for(int j = 1 ; j <= i ; j++){
				if(i % 2 == 0 ){
					System.out.print(num + "\t");
					num--;
				}else{
					System.out.print(ch + "\t");
					ch--;
				}
				
			}
			System.out.println();
		}
	}

}
