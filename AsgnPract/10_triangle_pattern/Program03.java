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
 * 	 3
 * 	 3 2
 * 	 3 2 1
 *
 * 	Input : row = 4
 *	
 *	 4 
 *	 4 3
 *	 4 3 2
 *	 4 3 2 1
 * 	 
 *
 *
 */


import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();

		System.out.println("Type : 1");
		for(int i = row; i >= 1 ; i--){
			for(int j = row ; j >= i ; j--){
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		System.out.println("Type : 2 ");

		for(int i = 1 ; i <= row ; i++){
			int num = row;
			for(int j = 1; j <= i ; j++){
				System.out.print(num + "\t");
				num--;
			}
			System.out.println();
		}

	}

}
