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
 *	 3 3 3 
 *   	 2 2
 *   	 1
 *
 * 	Input : row = 4
 *
 * 	 4 4 4 4
 * 	 3 3 3
 * 	 2 2
 * 	 1
 *
 *
 */


import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		
		int num = row;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row + 1 - i ; j++){
				System.out.print(num + "\t");
			}
			num--;
			System.out.println();
		}
	}

}
