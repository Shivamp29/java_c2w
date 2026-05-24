/*
 * Right angle triangle :
 *
 * 	* * * *
 * 	* * *		// j <= row + 1 - i
 * 	* * 
 * 	*
 *
 *
 * 	Input : row = 3
 * 	 
 *	 3 6 9
 *	 2 4
 *	 1
 *
 * 	Input : row = 4
 *
 * 	 4 8 12 16
 * 	 3 6 9
 * 	 2 4
 * 	 1
 *
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		
		for(int i = 1 ; i <= row ; i++ ){
			int num = row + 1 - i;
			for(int j = 1 ; j <= row + 1 - i ; j++){
				System.out.print(num + "\t");
				num += (row + 1 -i) ;
			}
			System.out.println();
		}
	}

}
