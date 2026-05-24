/*
 * Right angle triangle :
 *
 * 	*
 * 	* *		// j <= i
 * 	* * *
 * 	* * * *
 *
 *
 * 	Input : row = 3
 * 	 
 *	 A 
 *	 B C
 *	 D E F
 *
 * 	Input : row = 4
 *
 * 	 A 
 * 	 B C
 * 	 D E F
 * 	 G H I J
 *
 *
 */


import java.util.Scanner;

class Program04{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		char ch = 'A';
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(ch + "\t");
				ch++;
			}
			System.out.println();

		}
	}

}
