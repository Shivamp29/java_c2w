/*
 *	WAP to print the following pattern
 *
 *      1. input : Enter String c2w
 *      2. input : row = 3
 *
 *		c2w c2w c2w 
 *		c2w c2c c2w
 *		c2w c2w c2w
 *
 */

import java.util.Scanner;

class Program02{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first name :");
                String str = ip.nextLine();
		System.out.println("Enter the no. of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
			       	System.out.print(str + " ");
			}
			System.out.println();
		}
	}

}
