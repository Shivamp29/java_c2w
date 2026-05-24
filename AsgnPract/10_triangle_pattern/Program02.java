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
 * 	 1
 * 	 1 2
 * 	 1 2 3
 *
 * 	 Input : row = 4
 *
 * 	 1 
 * 	 1 2
 * 	 1 2 3
 * 	 1 2 3 4
 *
 *
 */


import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(j+"\t");	
			}
			System.out.println();
		}
		
	}

}
