/*
 *
 *	WAP to to print the folowing pattern
 *
 *	Input : row = 3
 *
 *		1 
 *		B A
 *		3 2 1
 *
 *	Input : row = 4
 *
 *		1
 *		B A
 *		3 2 1
 *		D C B A
 *
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i  = 1 ; i <= row ; i++){
			int num = i;
			char ch = (char) (64 + i);
			for(int j = 1 ; j <= i ; j++){
				if(i % 2 == 0){
					System.out.print(ch+"\t");
					ch--;
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
