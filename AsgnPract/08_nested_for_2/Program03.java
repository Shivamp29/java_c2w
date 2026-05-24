/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *		
 *		c b a
 *		c b a
 *		c b a
 *
 * 	2. input row : 4
 *
 * 		d c b a
 * 		d c b a
 * 		d c b a
 * 		d c b a
 *
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	 for(int i = 1 ; i <= row ; i++){
		char ch = (char) (96 + row);
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print(ch+" ");
			ch--;
		}
		System.out.println();
	
	 }
	
	}

}
