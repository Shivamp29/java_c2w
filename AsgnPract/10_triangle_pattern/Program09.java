/*
 * Right angle triangle :
 *
 * 	* * * *
 * 	* * *		// j <= row + 1 - i
 * 	* * 
 * 	*
 *
 *
 * 	Input : row = 4
 * 	 
 *	 D C B A
 *	 D C B
 *	 D C
 *	 D
 *
 * 	Input : row = 5
 *
 * 	 E D C B A
 * 	 E D C B
 * 	 E D C 
 * 	 E D 
 * 	 E
 *
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		
		for(int i = 1 ; i <= row ; i++){
			char ch = (char)( 64 + row);
			for(int j = 1; j<= row+1-i ; j++){
				System.out.print(ch+"\t");
				ch--;
			}
			System.out.println();
		}
	}

}
