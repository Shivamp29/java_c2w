/*
 *	WAP to print the following pattern
 *
 *      1. input row = 3
 *		1A 2B 3C
 *		1A 2B 3C
 *		1A 2B 3C
 *
 *	2. input row = 4
 *		1A 2B 3C 4D
 *		1A 2B 3C 4D
 *		1A 2B 3C 4D
 *		1A 2B 3C 4D
 */

import java.util.Scanner;

class Program10{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no. of row : ");
		int row = ip.nextInt();
		char ch = 65;
		for(int i = 1 ; i <= row ; i++){
			ch = 65;
			for(int j = 1 ; j <= row ; j++){
			       	System.out.print(j+""+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
